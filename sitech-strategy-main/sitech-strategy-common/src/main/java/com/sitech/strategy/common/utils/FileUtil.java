package com.sitech.strategy.common.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * sitech文件操作类继承common.io.FileUtils
* @date: 2016-12-11 
* @author: zhangjj_crmpd
* @title: FileUtil 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class FileUtil extends FileUtils{
	
	/**
	 * 获取文件名(不包括后缀)
	* @date: 2016-11-24 
	* @author: zhangjj_crmpd
	* @title: getFileName 
	* @param fileName
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String getFileName(String fileName){
		if (fileName == null || "".equals(fileName.trim())) {
            return "";
        }
		if (fileName.contains(".")) {
            return fileName.substring(0,fileName.lastIndexOf("."));
        }
		return "";
	}
	
	/**
	 * 获取文件名后缀
	* @date: 2016-11-18 
	* @author: zhangjj_crmpd
	* @title: getPostfix 
	* @param path
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String getPostfix(String path) {
        if (path == null || "".equals(path.trim())) {
            return "";
        }
        if (path.contains(".")) {
            return path.substring(path.lastIndexOf(".") + 1, path.length());
        }
        return "";
    }
	
	
	/**
	 * 移动文件至指定目录下
	* @date: 2016-12-11 
	* @author: zhangjj_crmpd
	* @title: moveSrcFile 
	* @param srcDir
	* @param destDir
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void moveSrcFile(File srcDir, File destDir) throws StrategyError{
		try {
			copyFileToDirectory(srcDir, destDir);
			srcDir.delete();
		} catch (IOException e) {
			e.printStackTrace();
			throw new StrategyError(e);
		}
	}
	
	
	/**
	 * 读取CSV文件
	* @date: 2016-11-25 
	* @author: zhangjj_crmpd
	* @title: readCsv 
	* @param path
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static List<List<String>> readCsv(String path) throws StrategyError{
		System.out.println("readCsv path:"+path);
		List<List<String>> csvList = new ArrayList<List<String>>();
		BufferedReader br =null;
		try {
			br = new BufferedReader(new InputStreamReader( new FileInputStream(path),"GBK"));
			String line =null;
			while ( (line = br.readLine()) != null ) {
				   String newLine = new String(line.getBytes("GBK"),"GBK");
				   String[] cellInfo = newLine.split(",");
				   List<String> cellList = Arrays.asList(cellInfo);
				   csvList.add(cellList);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new StrategyError(e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new StrategyError(e);
		}
		return csvList;
	}
	
	/**
	 * 读取Excel文件(兼容xls、xlsx)
	* @date: 2016-11-23 
	* @author: zhangjj_crmpd
	* @title: readExcel 
	* @param path
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	 * @throws IOException 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static List<List<String>> readExcel(String path) throws StrategyError{
		System.out.println("readExcel path:"+path);
		if (path == null || "".equals(path)) {
		    return null;
		} else {
		    String postfix = getPostfix(path);
		    if (!"".equals(postfix)) {
		        if ("xls".equals(postfix)) {
					return readXls(path);
		        } else if ("xlsx".equals(postfix)) {
		            return readXlsx(path);
		        }
		    } else {
		    }
		}
        return null;
    }
	
	/**
	 * 按行读取文本文件
	* @date: 2016-12-7 
	* @author: zhangjj_crmpd
	* @title: readTxt 
	* @param path
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static List<String> readTxt(String path) throws StrategyError{
		System.out.println("readTxt path:"+path);
		List<String> txtList = new ArrayList<String>();
		BufferedReader br =null;
		try {
			br = new BufferedReader(new InputStreamReader( new FileInputStream(path),"UTF-8"));
			String line =null;
			while ( (line = br.readLine()) != null ) {
				   String newLine = new String(line.getBytes("UTF-8"),"UTF-8");
				   txtList.add(newLine);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new StrategyError(e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new StrategyError(e);
		}
		return txtList;
	}
	
	/**
	 * 读取xlsx格式文件
	* @date: 2016-11-23 
	* @author: zhangjj_crmpd
	* @title: readXlsx 
	* @param path
	* @return
	* @throws IOException 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected static List<List<String>> readXlsx(String path) throws StrategyError{
		List<List<String>> list = new ArrayList<List<String>>();
        try {
			InputStream is = new FileInputStream(path);
			XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
			// Read the Sheet
			for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
			    XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
			    if (xssfSheet == null) {
			        continue;
			    }
			    // Read the Row
			    for (int rowNum = 0; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
			        XSSFRow xssfRow = xssfSheet.getRow(rowNum);
			        if (xssfRow != null) {
			        	List<String> rowList = new ArrayList<String>();
			        	for(int xssfRowNum=0;xssfRowNum<xssfRow.getLastCellNum();xssfRowNum++){
			        		rowList.add(getValue(xssfRow.getCell(xssfRowNum)));
			        	}
			            list.add(rowList);
			        }
			    }
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new StrategyError(e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new StrategyError(e);
		}
        return list;
    }
	
	/**
	 * 读取xls格式文件
	* @date: 2016-11-23 
	* @author: zhangjj_crmpd
	* @title: readXls 
	* @param path
	* @return
	* @throws IOException 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected static List<List<String>> readXls(String path) throws StrategyError {
		List<List<String>> list = new ArrayList<List<String>>();
        try {
			InputStream is = new FileInputStream(path);
			HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
			// Read the Sheet
			for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
			    HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			    if (hssfSheet == null) {
			        continue;
			    }
			    // Read the Row
			    for (int rowNum = 0; rowNum < hssfSheet.getLastRowNum(); rowNum++) {
			        HSSFRow hssfRow = hssfSheet.getRow(rowNum);
			        if (hssfRow != null) {
			        	List<String> rowList = new ArrayList<String>();
			        	for(int hssfRowNum=0;hssfRowNum<hssfRow.getLastCellNum();hssfRowNum++){
			        		rowList.add(getValue(hssfRow.getCell(hssfRowNum)));
			        	}
			            list.add(rowList);
			        }
			    }
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new StrategyError(e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new StrategyError(e);
		}
        return list;
    }
	
	/**
	 * 获取每个单元内容
	* @date: 2016-11-23 
	* @author: zhangjj_crmpd
	* @title: getValue 
	* @param xssfRow
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	 * @throws UnsupportedEncodingException 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected static String getValue(XSSFCell xssfRow) throws StrategyError {
        if (xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
            return String.valueOf(xssfRow.getBooleanCellValue());
        } else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
            DecimalFormat df = new DecimalFormat("0"); 
        	return df.format(xssfRow.getNumericCellValue());
        } else {
        	try {
				return new String(xssfRow.getStringCellValue().getBytes("UTF-8"),"UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				throw new StrategyError(e);
			}
        }
    }
	
	/**
	 * 获取每个单元内容
	* @date: 2016-11-23 
	* @author: zhangjj_crmpd
	* @title: getValue 
	* @param hssfCell
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	 * @throws UnsupportedEncodingException 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected static String getValue(HSSFCell hssfCell) throws StrategyError {
		if(CommonUtils.objectIsNull(hssfCell)){
			return "";
		}
        if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
            return String.valueOf(hssfCell.getBooleanCellValue());
        } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
        	DecimalFormat df = new DecimalFormat("0"); 
        	return df.format(hssfCell.getNumericCellValue()); 
        } else {
            try {
				return new String(hssfCell.getStringCellValue().getBytes("UTF-8"),"UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				throw new StrategyError(e);
			}
        }
    }
	
	/**
	 * 将内容写入指定的文件中
	* @date: 2016-11-24 
	* @author: zhangjj_crmpd
	* @title: write2File 
	* @param ContentList
	* @param fileName 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void write2File(List<String> ContentList,String fileName) throws StrategyError{
		if(CommonUtils.objectIsNull(ContentList) || CommonUtils.objectIsNull(fileName)){
			return;
		}
		File file = new File(fileName);
		OutputStream out = null;
        BufferedWriter writer = null;
        try {
        	out=new FileOutputStream(file); 
			writer = new BufferedWriter(new OutputStreamWriter(out,"utf-8"));
	        for(String str:ContentList){
	        	writer.write(str);
	        	writer.newLine();
	        }
	        writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
			throw new StrategyError(e);
		}finally{
			if(!CommonUtils.objectIsNull(writer)){
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
					throw new StrategyError(e);
				}
			}
			if(!CommonUtils.objectIsNull(out)){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
					throw new StrategyError(e);
				}
			}
		}
        
	}

}
