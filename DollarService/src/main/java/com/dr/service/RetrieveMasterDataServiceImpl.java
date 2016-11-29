/**
 * 
 */
package com.dr.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Component;

import com.dr.bean.EmploymentType;
import com.dr.bean.ShiftModReason;
import com.dr.common.util.DRDBConnect;
import com.dr.common.util.DRDBOperations;
import com.dr.db.entity.Bank;
import com.dr.db.entity.Cadre;
import com.dr.db.entity.Contractor;
import com.dr.db.entity.Department;
import com.dr.db.entity.Holiday;
import com.dr.db.entity.Increment;
import com.dr.db.entity.Loan;
import com.dr.db.entity.Location;
import com.dr.db.entity.Punishment;
import com.dr.db.entity.Shift;
import com.dr.dto.BankDetailsDTO;
import com.dr.dto.HolidayDetailDTO;
import com.dr.dto.IncrementDetailsDTO;
import com.dr.dto.LoanDetailsDTO;
import com.dr.dto.PunishmentDetailsDTO;
import com.dr.dto.ShiftDetailsDTO;


/**
 * 
 * @author Vaishnavie
 *
 */
@Component(value = "masterDataService")
public class RetrieveMasterDataServiceImpl implements RetrieveMasterDataService{

	public EmploymentType getEmploymentType() {
		// TODO Auto-generated method stub
		return null;
	}

	public ShiftModReason getShiftModificationReason() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Department> getDepartmentDetails() {
		EntityManager entitymanager = DRDBConnect.getEntityManager();
		CriteriaBuilder criteriaBuilder = entitymanager
				.getCriteriaBuilder();
		CriteriaQuery<Object> criteriaQuery = criteriaBuilder
				.createQuery();
		Root<com.dr.db.entity.Department> from = criteriaQuery.from(com.dr.db.entity.Department.class);
		
		CriteriaQuery<Object> select =criteriaQuery.select(from);
		TypedQuery<Object> typedQuery = entitymanager
				.createQuery(select);
		List<Object> resultlist= typedQuery.getResultList();
		List<Department> deptList= 	new ArrayList<Department>();
		for(Object o:resultlist)
		{
			com.dr.db.entity.Department d=(com.dr.db.entity.Department)o;
			System.out.println("EID : "+d.getDeptId()
					+" Ename : "+d.getDeptName());
			deptList.add(d);
			
		}
		entitymanager.close( );
		return deptList;
	}
	public void createAddLocation(Location locationdto) {

		try {
			String locationName = locationdto.getLocationName();
			String locationAddress = locationdto.getLocationAddress();
			String operationLocation = locationdto.getOperationLocation();
			String ipAddtessFrom = locationdto.getIpAddtessFrom();
			String ipAddtessTo = locationdto.getIpAddtessTo();
			String locationHead = locationdto.getLocationHead()!= null? locationdto.getLocationHead().trim():null;
			System.out.println("Location head "+locationHead+"**");
			String pointOfContact = locationdto.getPointOfContact();
			String policeContact = locationdto.getPoliceContact();
			String labourOffice = locationdto.getLabourOffice();

			Location location = new Location(locationName, locationAddress, operationLocation, ipAddtessFrom,
					ipAddtessTo, locationHead, pointOfContact, policeContact, labourOffice);
			System.out.println("inserted data ");
			DRDBOperations.insertRecord(location);
			System.out.println("inserted data after  at impl");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void updateCadreData(Cadre cdto) {
		// TODO Auto-generated method stub
		try {

			String cadreName = cdto.getCadreName();
			String minimumSalary = cdto.getMaximumSalary();
			String maxumumSalary = cdto.getMaximumSalary();
			String ecar = cdto.getCarEligible();
			String ebike = cdto.getBikeEligible();
			String equalification = cdto.getEducationalQualification();
			String expRequired = cdto.getExperienceRequired();
			String skill = cdto.getSkillsRequired();
			String shiftProductivity = cdto.getShiftproductivity();
			String monthProductivity = cdto.getMonthproductivity();
			Cadre cdtof = new Cadre(cadreName, minimumSalary, maxumumSalary, ecar, ebike, equalification, expRequired,
					skill, shiftProductivity, monthProductivity);

			System.out.println("inserted data ");
			DRDBOperations.insertRecord(cdtof);
			System.out.println("inserted data after  at impl");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void updateData(Cadre cdto) {

		try {
			String cadreName = cdto.getCadreName();
			String minimumSalary = cdto.getMaximumSalary();
			String maxumumSalary = cdto.getMaximumSalary();
			String ecar = "y";
			String ebike = "n";
			String equalification = cdto.getEducationalQualification();
			String expRequired = cdto.getExperienceRequired();
			String skill = cdto.getSkillsRequired();
			String shiftProductivity = cdto.getShiftproductivity();
			System.out.println(shiftProductivity);
			String monthProductivity = cdto.getMonthproductivity();
			Cadre cdtof = new Cadre(cadreName, minimumSalary, maxumumSalary, ecar, ebike, equalification, expRequired,
					skill, shiftProductivity, monthProductivity);

			System.out.println("inserted data ");
			DRDBOperations.insertRecord(cdtof);
			System.out.println("inserted data after  at impl");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void createshift(ShiftDetailsDTO shiftDTO) {

		try {
			String shiftFromTime = shiftDTO.getShiftFromTime();
			String shiftToTime = shiftDTO.getShiftToTime();
			String shiftHrs = shiftDTO.getShiftHrs();

			Shift shiftdet = new Shift(shiftFromTime, shiftToTime, shiftHrs);

			System.out.println("Please insert data");

			DRDBOperations.insertRecord(shiftdet);

			System.out.println("sucesssssss");

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Loan module
	public void createloan(LoanDetailsDTO loanDTO) {

		try {
			String loandesc = loanDTO.getLoanDesc();
			String maxloan = loanDTO.getMaxLoanAmount();
			String maxinstallment = loanDTO.getMaxNumOfInst();
			// String loanint = loanDTO.getLoanInterest();
			String loanint = "y";
			String loanintrate = loanDTO.getInterestRate();
			String nextloanavail = loanDTO.getNextLoanAvailability();

			Loan loandet = new Loan(loandesc, maxloan, maxinstallment, loanint, loanintrate, nextloanavail);

			System.out.println("Please insert data");

			DRDBOperations.insertRecord(loandet);

			System.out.println("sucesssssss");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Punishment module

	public void createpunishment(PunishmentDetailsDTO punishDTO) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date;

		try {

			int empid = punishDTO.getEmpId();
			String punish = punishDTO.getPunishment();
			String finanloss = punishDTO.getFinancialLoss();

			String punishdate = punishDTO.getPunishDate();

			date = sdf.parse(punishdate);

			//System.out.println(punishdate);
			Punishment punishdet = new Punishment(empid, punish, finanloss, punishdate);

			System.out.println("Please insert data");

			DRDBOperations.insertRecord(punishdet);

			System.out.println("sucesssssss");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Location getLocationData(Location location) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getAllLocation() {
		// TODO Auto-generated method stub
		return null;
	}
	public void createHolidayDetails(HolidayDetailDTO holDetDTO) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date1;
		try {

			String holdesc = holDetDTO.getHolDesc();
			System.out.println("Data stored in DB" + holdesc);
			String holDate = holDetDTO.getHolDate();
			date1 = sdf.parse(holDate);

			/* String holcode = holList.getHolType(); */

			/* java.util.Date holDate = sdf.parse(holDetDTO.getHolDate()); */
			Holiday holiday = new Holiday(holdesc, holDate);
			System.out.println("insert data");
			DRDBOperations.insertRecord(holiday);
			System.out.println("inserted data after implementing");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Cadre> getHolidayList() {
		// EmployeeSeparation empsep = new EmployeeSeparation();
		System.out.println("before read data");

		List<Cadre> list = retriveRecordForSeparation();// here we call the
														// DRDBOperations
														// class's
														// "retriveRecordForSeparation"
														// method
		System.out.println("inserted data after implemeting");

		return list;
	}

	public List<Cadre> retriveRecordForSeparation() {
		final EntityManager em = DRDBConnect.getEntityManager();
		Query query = em.createNativeQuery("select * from cadre", Cadre.class);
		em.getTransaction().begin();
		@SuppressWarnings("unchecked")
		List<Cadre> list = query.getResultList();
		em.getTransaction().commit();

		return list;
	}

	public List<Location> getLocationList() {
		// EmployeeSeparation empsep = new EmployeeSeparation();
		System.out.println("before read data");

		List<Location> list1 = retriveRecordForSeparation1();// here we call the
																// DRDBOperations
																// class's
																// "retriveRecordForSeparation"
																// method
		System.out.println("inserted data after implemeting");

		return list1;
	}

	public List<Location> retriveRecordForSeparation1() {
		final EntityManager em = DRDBConnect.getEntityManager();
		Query query = em.createNativeQuery("select * from facility", Location.class);
		em.getTransaction().begin();
		@SuppressWarnings("unchecked")
		List<Location> list = query.getResultList();
		em.getTransaction().commit();

		return list;
	}

	public void createBankDetails(BankDetailsDTO bnkDetDTO) {
		// TODO Auto-generated method stub
		try {

			String naMe = bnkDetDTO.getNaMe();
			String branchName = bnkDetDTO.getBranchName();
			/* String stationName = bnkDetDTO.getStationName(); */
			String ifscCode = bnkDetDTO.getIfscCode();
			String micrCode = bnkDetDTO.getMicrCode();
			String conTact = bnkDetDTO.getConTact();
			System.out.println("Data stored in DB" + naMe);
			System.out.println("Data stored in DB" + branchName);
			/* System.out.println("Data stored in DB" +stationName); */
			System.out.println("Data stored in DB" + ifscCode);
			System.out.println("Data stored in DB" + micrCode);
			System.out.println("Data stored in DB" + conTact);

			Bank bank = new Bank(naMe, branchName, ifscCode, micrCode, conTact);
			System.out.println("insert data");
			DRDBOperations.insertRecord(bank);
			System.out.println("inserted data after implementing");

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void createContractorDetails(Contractor contr) {

		try {
			System.out.println("insert data");
			DRDBOperations.insertRecord(contr);
			System.out.println("inserted data after implementing");

		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void createIncrementDetails(IncrementDetailsDTO incrDetDTO) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date;
		try {
			int empID = incrDetDTO.getEmpID();
			String nxtDate = incrDetDTO.getNxtDate();
			date = sdf.parse(nxtDate);
			System.out.println(date);
			String incrRate = incrDetDTO.getIncrRate();
			System.out.println("Data stored in DB" + empID);
			System.out.println("Data stored in DB" + nxtDate);
			System.out.println("Data stored in DB" + incrRate);
			Increment incr = new Increment(empID, nxtDate, incrRate);
			System.out.println("insert data");
			DRDBOperations.insertRecord(incr);
			System.out.println("inserted data after implementing");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Bank> getBankDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("before read data");

		List<Bank> bankdet = retriveRecordForSeparation2();// here we call the
																// DRDBOperations
																// class's
																// "retriveRecordForSeparation"
																// method
		System.out.println("inserted data after implemeting");

		return bankdet;
	
	}
	
	public List<Bank> retriveRecordForSeparation2() {
		final EntityManager em = DRDBConnect.getEntityManager();
		Query query = em.createNativeQuery("select * from bank", Bank.class);
		em.getTransaction().begin();
		@SuppressWarnings("unchecked")
		List<Bank> bankdet = query.getResultList();
		em.getTransaction().commit();

		return bankdet;
	}

}
