package domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
@Table(name="attend_inf")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Attend implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 48L;
    //标识属性
	@Id@Column(name="attend_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	//打卡日期
	@Column(name="duty_day",nullable=false,length=50)
	private String dutyDay;
	//打卡时间
	@Column(name="punch_time")
	private Date punchTime;
	//是否是上班打卡
	@Column(name="is_come",nullable=false)
	private boolean isCome;
	//本次出勤类型
	@ManyToOne(targetEntity=AttendType.class)
	@JoinColumn(name="type_id")
	private AttendType type;
	//许多出勤可能对应一个员工
	@ManyToOne(targetEntity=Employee.class)
	@JoinColumn(name="emp_id")
	private Employee employee;
	
	//构造函数
	public Attend(){
		
	}
	public Attend(Integer id,String dutyDay,Date punchTime,
			boolean isCome,AttendType type,Employee employee){
		this.id=id;
		this.dutyDay=dutyDay;
		this.punchTime=punchTime;
		this.isCome=isCome;
		this.type=type;
		this.employee=employee;
	}
	// id的setter和getter方法
		public void setId(Integer id)
		{
			this.id = id;
		}
		public Integer getId()
		{
			return this.id;
		}

		// dutyDay的setter和getter方法
		public void setDutyDay(String dutyDay)
		{
			this.dutyDay = dutyDay;
		}
		public String getDutyDay()
		{
			return this.dutyDay;
		}

		// punchTime的setter和getter方法
		public void setPunchTime(Date punchTime)
		{
			this.punchTime = punchTime;
		}
		public Date getPunchTime()
		{
			return this.punchTime;
		}

		// isCome的setter和getter方法
		public void setIsCome(boolean isCome)
		{
			this.isCome = isCome;
		}
		public boolean getIsCome()
		{
			return this.isCome;
		}

		// type的setter和getter方法
		public void setType(AttendType type)
		{
			this.type = type;
		}
		public AttendType getType()
		{
			return this.type;
		}

		// employee的setter和getter方法
		public void setEmployee(Employee employee)
		{
			this.employee = employee;
		}
		public Employee getEmployee()
		{
			return this.employee;
		}
		
		@Override
		public int hashCode(){
			final int prime = 31;
			int result = 1;
			result = prime * result
				+ ((dutyDay == null) ? 0 : dutyDay.hashCode());
			result = prime * result
				+ ((employee == null) ? 0 : employee.hashCode());
			result = prime * result + (isCome ? 1231 : 1237);
			return result;
		}
		@Override
		public boolean equals(Object obj){
			if(this==obj) return true;
			if(obj==null) return false;
			if(this.getClass()!=obj.getClass()) return false;
		    
			Attend other=(Attend) obj;
			if(dutyDay==null) {
				if(other.dutyDay!=null) return false;
			}
			else if(!(this.dutyDay.equals(other.dutyDay))){
				return false;
			}
			if(employee==null) {
				if(other.employee!=null) return false;
			}
			else if(!(this.employee.equals(other.employee))){
				return false;
			}
			
			return true;
			
		}
	
	

}
