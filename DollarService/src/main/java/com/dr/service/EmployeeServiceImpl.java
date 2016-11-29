package com.dr.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;

import com.dr.common.util.DRDBOperations;
import com.dr.common.util.DRDateUtil;
import com.dr.db.entity.Employee;
import com.dr.db.entity.EmployeeAttendance;
import com.dr.db.entity.EmployeeSeparationDB;
import com.dr.dto.EmployeeDetailDTO;
import com.dr.dto.EmployeeShiftDetailDTO;

@Component(value = "empService")
public class EmployeeServiceImpl implements EmployeeService {

	public void createEmployeeDetails(final EmployeeDetailDTO empDetDTO) {
		Employee employee= new Employee();
		employee.setEmpId(0);
		employee.setFirstName(empDetDTO.getFirstName());
		employee.setCadreId(empDetDTO.getCadreId());
		employee.setDeptID(empDetDTO.getDeptID());
		employee.setPanNumber(empDetDTO.getPanNumber());
		employee.setBankId(00001);
		employee.setBankAccNumber(empDetDTO.getBankAccNumber());
		employee.setFacilityId(empDetDTO.getFacilityId());
		employee.setSupervisorId(empDetDTO.getSupervisorId());
		employee.setDateOfBirth(DRDateUtil.convertStrToDate(empDetDTO.getDateOfBirth()));
		employee.setDateOfJoining(DRDateUtil.convertStrToDate(empDetDTO.getDateOfJoining()));
		employee.setDateOfLeaving(DRDateUtil.convertStrToDate(empDetDTO.getDateOfLeaving()));
		employee.setEmailId(empDetDTO.getEmailId());
		employee.setBloodGrp(empDetDTO.getBloodGrp());
		employee.setGender(empDetDTO.getGender());
		employee.setPrevExperience(empDetDTO.getPrevExperience());
		employee.setHostelier('N');
		employee.setHandicapped('N');
		employee.setEmpActive('Y');
		System.out.println(empDetDTO.getFirstName()+" "+empDetDTO.getPanNumber()+" "+empDetDTO.getBloodGrp());
		DRDBOperations.insertRecord(employee);
	}

	public void modifyEmployeeShiftTime(EmployeeShiftDetailDTO empShiftDetailDTO) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date;
		try {
			String dateStr = empShiftDetailDTO.getShiftDate();
			date = sdf.parse(dateStr);
			java.sql.Date shiftDate = new java.sql.Date(date.getTime());
			SimpleDateFormat sdf1  = new SimpleDateFormat("HH:mm");
			java.util.Date endTime = sdf1.parse(empShiftDetailDTO.getEndTime());
			java.util.Date startTime = sdf1.parse(empShiftDetailDTO.getStartTime());
			long diff = endTime.getTime()-startTime.getTime();
			long diffHours = (diff)/(60 * 60 * 1000) % 24;
			long diffMinutes = diff / (60 * 1000) % 60;
			double hoursWorked= 0;
			System.out.println(diff +" "+diffHours+ " "+diffMinutes);
			if (diffMinutes > 30){
				hoursWorked = diffHours+1;
			}else if(diffMinutes > 0 && diffMinutes <= 30){
				hoursWorked=diffHours+0.5;
				System.out.println("<=30 "+hoursWorked);
			}
			System.out.println("Hours worked -- "+ hoursWorked);
			EmployeeAttendance empAttdn =new EmployeeAttendance(empShiftDetailDTO.getEmpId(), shiftDate,hoursWorked);
			DRDBOperations.insertRecord(empAttdn);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub

	}

	// EmployeeSeparation

	public void createEmployeeSeparation(EmployeeSeparationDB empSepDetailDTO) {

		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 * java.util.Date date1;
		 */

		try {
			String empId = empSepDetailDTO.getEmpId();
			String exitType = empSepDetailDTO.getExitType();
			String resignationDate = empSepDetailDTO.getResignationDate();
			String lastWorkingDay = empSepDetailDTO.getLastWorkingDay();
			String reasonForExit = empSepDetailDTO.getReasonForExit();
			String remarks = empSepDetailDTO.getRemarks();
			String noticeWaiver = empSepDetailDTO.getNoticeWaiver();
			String elgibleForReEmployeement = empSepDetailDTO.getElgibleForReEmployeement();
			String salarytobePaidforDays = empSepDetailDTO.getSalarytobepaidforDays();

			EmployeeSeparationDB empSeparation = new EmployeeSeparationDB(empId, exitType, resignationDate,
					lastWorkingDay, reasonForExit, remarks, noticeWaiver, elgibleForReEmployeement,
					salarytobePaidforDays);

			System.out.println("insert data ");
			DRDBOperations.insertRecord(empSeparation);
			System.out.println("inserted data after implemeting");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
