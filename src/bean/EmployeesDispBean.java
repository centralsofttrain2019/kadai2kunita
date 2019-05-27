package bean;

import java.io.Serializable;
import java.util.List;

public class EmployeesDispBean implements Serializable
{
	private String message;
	private List<EmployeeBean> eList;

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<EmployeeBean> geteList() {
		return eList;
	}
	public void seteList(List<EmployeeBean> eList) {
		this.eList = eList;
	}

}
