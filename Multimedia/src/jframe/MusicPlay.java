package jframe;

import java.applet.*;
import java.awt.*;
import java.io.File;
import java.net.MalformedURLException;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MusicPlay extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;//面板布局
	private JTextField filePath = null;//文件地址
	private JButton openFile = null;//打开文件按钮
	private JButton playButton = null;//播放按钮
	private File selectedFile;//音乐文件
	private AudioClip audioClip;//音乐播放接口
	
	//文本路径框
	private JTextField getJTextField() {
		if (filePath == null) {
			filePath = new JTextField();
			filePath.setPreferredSize(new Dimension(200, 22));
			filePath.setEditable(false);
		}
		return filePath;
	}
	
	// 获取选择文件按钮的方法
	private JButton getOpenFile() {
		if (openFile == null) {
			openFile = new JButton();
			openFile.setText("选择文件");
			openFile.addActionListener(new java.awt.event.ActionListener() {
				
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//文本过滤
					JFileChooser fileChooser = new JFileChooser();
					fileChooser
							.setFileFilter(new FileNameExtensionFilter(
									"支持的音频文件（*.mid、*.wav、*.au", "wav",
									"au", "mid"));
					fileChooser.showOpenDialog(MusicPlay.this);
					selectedFile = fileChooser.getSelectedFile();
					filePath.setText(selectedFile.getAbsolutePath());
				}
			});
		}
		return openFile;
	}
	
	// 获取播放按钮的方法
	private JButton getPlayButton() {
		if (playButton == null) {
			playButton = new JButton();
			playButton.setText("播放");
			playButton
					.addActionListener(new java.awt.event.ActionListener() {
						
						public void actionPerformed(
								java.awt.event.ActionEvent e) {
							if (selectedFile != null) {
								try {
									if (audioClip != null)
										audioClip.stop();
									audioClip = Applet
											.newAudioClip(selectedFile
													.toURI().toURL());
									audioClip.play();
								} catch (MalformedURLException e1) {
									e1.printStackTrace();
								}
							}
						}
					});
		}
		return playButton;
	}
	
	public static void main(String[] args) {
		MusicPlay thisClass = new MusicPlay();
		thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thisClass.setVisible(true);
	}
	
	public MusicPlay() {
		super();
		initialize();
	}
	
	// 初始化方法
	private void initialize() {
		this.setSize(800,200);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}
	
	// 初始化内容面板的方法
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new FlowLayout());
			jContentPane.add(getJTextField(), null);
			jContentPane.add(getOpenFile(), null);
			jContentPane.add(getPlayButton(), null);
		}
		return jContentPane;
	}
}