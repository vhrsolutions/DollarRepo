package com.dr.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dr.bean.EmployeeSepforPay;
import com.dr.bean.EmploymentType;
import com.dr.common.constants.DRResponseStatus;
import com.dr.common.util.DRRequestData;
import com.dr.common.util.DRResponseData;
import com.dr.db.entity.Department;
import com.dr.db.entity.EmployeeSeparationDB;
import com.dr.dto.EmployeeDetailDTO;
import com.dr.dto.EmployeeShiftDetailDTO;
import com.dr.service.EmployeeService;
import com.dr.service.RetrieveMasterDataService;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	@Autowired
	RetrieveMasterDataService masterDataService;

	@RequestMapping(value = "/employmentTypes", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public @ResponseBody DRResponseData<List<EmploymentType>> getEmploymentTypes(final HttpServletRequest request) {
		final DRResponseData<List<EmploymentType>> drResponse = new DRResponseData<List<EmploymentType>>(1234,
				createEmploymentTypeList());
		drResponse.setDrResponseStatus(DRResponseStatus.SUCCESS);
		return drResponse;
	}

	@RequestMapping(value = "/createEmployeeDetails", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public @ResponseBody DRResponseData<String> createEmployeeDetails(final HttpServletRequest req,
			@RequestBody final DRRequestData<EmployeeDetailDTO> drRequestData) {
		final EmployeeDetailDTO empDetDTO = new EmployeeDetailDTO();
		empDetDTO.setEmpId(drRequestData.getRequestData().getEmpId());
		empDetDTO.setFirstName(drRequestData.getRequestData().getFirstName());
		System.out.println("Emp ID " + drRequestData.getRequestData().getEmpId());
		System.out.println("First Name " + drRequestData.getRequestData().getFirstName());
		empService.createEmployeeDetails(drRequestData.getRequestData());
		final DRResponseData<String> drResponseData = new DRResponseData<String>(1234l, DRResponseStatus.SUCCESS);
		return drResponseData;
	}
	
	@RequestMapping(value = "/loadRefDataEmployee", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public @ResponseBody DRResponseData<List<Department>> getRefDataForDepartment(final HttpServletRequest request) {
		final DRResponseData<List<Department>> drResponse = new DRResponseData<List<Department>>(1234,
				masterDataService.getDepartmentDetails());
		drResponse.setDrResponseStatus(DRResponseStatus.SUCCESS);
		return drResponse;
	}
	
	@RequestMapping(value = "/getReferenceDataForShiftMod", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public @ResponseBody DRResponseData<List<EmploymentType>> getReferenceDataForShiftMod(final HttpServletRequest request) {
		final DRResponseData<List<EmploymentType>> drResponse = new DRResponseData<List<EmploymentType>>(1234,
				createEmploymentTypeList());
		drResponse.setDrResponseStatus(DRResponseStatus.SUCCESS);
		return drResponse;
	}
	
	@RequestMapping(value = "/modifyShiftTime", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public @ResponseBody DRResponseData<String> modifyShiftTime(final HttpServletRequest req,
			@RequestBody final DRRequestData<EmployeeShiftDetailDTO> drRequestData) {
		final EmployeeShiftDetailDTO empShiftDetDTO = new EmployeeShiftDetailDTO();
		empShiftDetDTO.setEmpId(drRequestData.getRequestData().getEmpId());
		empShiftDetDTO.setShiftDate(drRequestData.getRequestData().getShiftDate());
		empShiftDetDTO.setStartTime(drRequestData.getRequestData().getStartTime());
		empShiftDetDTO.setEndTime(drRequestData.getRequestData().getEndTime());
		System.out.println("Emp ID " + drRequestData.getRequestData().getEmpId());
		System.out.println("Date From " + drRequestData.getRequestData().getShiftDate()
				+" Time In "+ drRequestData.getRequestData().getStartTime()+" Time out "+ drRequestData.getRequestData().getEndTime());
		empService.modifyEmployeeShiftTime(empShiftDetDTO);
		final DRResponseData<String> drResponseData = new DRResponseData<String>(1234l, DRResponseStatus.SUCCESS);
		return drResponseData;
	}
	@RequestMapping(value = "/employmentTypes", method = RequestMethod.GET)
	public List<EmploymentType> getEmploymentTypes() {
		List<EmploymentType> empTypeList = new ArrayList<EmploymentType>();
		empTypeList = createEmploymentTypeList();
		return empTypeList;
	}

	public List<EmploymentType> createEmploymentTypeList() {
		final EmploymentType empType1 = new EmploymentType("E001", "permanent");
		final EmploymentType empType2 = new EmploymentType("E002", "contract");
		final EmploymentType empType3 = new EmploymentType("E003", "vendor");
		final EmploymentType empType4 = new EmploymentType("E004", "parttime");
		final List<EmploymentType> empTypeList = new ArrayList<EmploymentType>();
		empTypeList.add(empType1);
		empTypeList.add(empType2);
		empTypeList.add(empType3);
		empTypeList.add(empType4);
		return empTypeList;
	}

	// ---------employeeSepration Controller---------

	@RequestMapping(value = "/empSepForPayProcess", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public @ResponseBody DRResponseData<List<EmployeeSepforPay>> getEmployeeSeparationPayProcess(
			final HttpServletRequest request) {
		final DRResponseData<List<EmployeeSepforPay>> drResponse = new DRResponseData<List<EmployeeSepforPay>>(1234,
				createPayProcessTypeList());
		drResponse.setDrResponseStatus(DRResponseStatus.SUCCESS);
		return drResponse;
	}

	@RequestMapping(value = "/createEmployeeSeparation", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public @ResponseBody DRResponseData<String> createemployeeSepration(final HttpServletRequest req,
			@RequestBody final DRRequestData<EmployeeSeparationDB> drRequestData) {
		
		System.out.println("service invoked");

		System.out.println("empID " + drRequestData.getRequestData().getEmpId());

		/*System.out.println("remarks" + drRequestData.getRequestData().getRemarks());

		System.out.println("reasonForExit " + drRequestData.getRequestData().getReasonForExit());

		System.out.println("lastWorkingDay " + drRequestData.getRequestData().getLastWorkingDay());*/

		empService.createEmployeeSeparation(drRequestData.getRequestData());
		final DRResponseData<String> drResponseData = new DRResponseData<String>(1234l, DRResponseStatus.SUCCESS);
		return drResponseData;
	}

	
	private List<EmployeeSepforPay> createPayProcessTypeList() {
		// TODO Auto-generated method stub
		final EmployeeSepforPay empSepPay1 = new EmployeeSepforPay("E001", "Credit card");
		final EmployeeSepforPay empSepPay2 = new EmployeeSepforPay("E002", "Debit card");
		final EmployeeSepforPay empSepPay3 = new EmployeeSepforPay("E003", "Cheque");
		final EmployeeSepforPay empSepPay4 = new EmployeeSepforPay("E004", "DD");

		final List<EmployeeSepforPay> empSepList1 = new ArrayList<EmployeeSepforPay>();
		empSepList1.add(empSepPay1);
		empSepList1.add(empSepPay2);
		empSepList1.add(empSepPay3);
		empSepList1.add(empSepPay4);
		System.out.println("List of pay process " + empSepList1);
		return empSepList1;

	}

	// shiftcontroller
	

	
	
	
	
	
	
	
	
}