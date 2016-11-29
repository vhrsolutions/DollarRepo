package com.dr.controller;

import java.util.ArrayList; 
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dr.common.constants.DRResponseStatus;
import com.dr.common.util.DRRequestData;
import com.dr.common.util.DRResponseData;
import com.dr.db.entity.Bank;
import com.dr.db.entity.Cadre;
import com.dr.db.entity.Contractor;
import com.dr.db.entity.Location;
import com.dr.dto.BankDetailsDTO;
import com.dr.dto.HolidayDetailDTO;
import com.dr.dto.IncrementDetailsDTO;
import com.dr.dto.LoanDetailsDTO;
import com.dr.dto.PunishmentDetailsDTO;
import com.dr.dto.ShiftDetailsDTO;
import com.dr.service.RetrieveMasterDataService;

@RestController
public class MasterController {
	// Add New Location Controller
	
	@Autowired
	RetrieveMasterDataService masterDataService;

		@RequestMapping(value = "/addLocation", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
		public @ResponseBody DRResponseData<String> addLocationDetails(final HttpServletRequest req,
				@RequestBody final DRRequestData<Location> drRequestData) {
			masterDataService.createAddLocation(drRequestData.getRequestData());
			System.out.println("after insert");
			final DRResponseData<String> drResponseData = new DRResponseData<String>(1122, DRResponseStatus.SUCCESS);
			return drResponseData;
		}
		
		// cadre Controller

		@RequestMapping(value = "/createcadre", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
		public @ResponseBody DRResponseData<String> addCaderDetails(final HttpServletRequest req,
				@RequestBody final DRRequestData<Cadre> drRequestData) {
			masterDataService.updateData(drRequestData.getRequestData());
			System.out.println("after insert");
			final DRResponseData<String> drResponseData = new DRResponseData<String>(1122, DRResponseStatus.SUCCESS);
			return drResponseData;
		}
		//read employee detail from  facility table based om facilityId
		
		@RequestMapping(value = "/locationetails/{facilityid}/location", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
		public @ResponseBody DRResponseData<Location> getEmployeDetails(@PathVariable("facilityid") String facilityid , final HttpServletRequest request) {
			Location location = new Location();
			location.setLocId(Integer.parseInt(facilityid));
			Location locationObj = masterDataService.getLocationData(location);
			
			final DRResponseData<Location> drResponse = new DRResponseData<Location>(1234,locationObj);
			if(locationObj!=null){
			drResponse.setDrResponseStatus(DRResponseStatus.SUCCESS);
			}
			else
				drResponse.setDrResponseStatus(DRResponseStatus.FAILURE);
			return drResponse;
		}
		
		@RequestMapping(value = "/locationList", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
		public @ResponseBody DRResponseData<List<Location>> getLocationList(final HttpServletRequest request) {
			final DRResponseData<List<Location>> drResponse = new DRResponseData<List<Location>>(1234, getLocationList());
			System.out.println("hi...from holidayList");
			drResponse.setDrResponseStatus(DRResponseStatus.SUCCESS);
			return drResponse;
		}
		/// reatrive all location details
		
		@RequestMapping(value = "/readlocationetails", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
		public @ResponseBody DRResponseData<List<String>> getEmployeDetails(final HttpServletRequest request) {
			
			List<String> locationlist = masterDataService.getAllLocation();
			
			final DRResponseData<List<String>> drResponse = new DRResponseData<List<String>>(1234,locationlist);
			if(locationlist!=null){
			drResponse.setDrResponseStatus(DRResponseStatus.SUCCESS);
			}
			else
				drResponse.setDrResponseStatus(DRResponseStatus.FAILURE);
			return drResponse;
		}
		@RequestMapping(value = "/createshift", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
		public @ResponseBody DRResponseData<String> createshift(final HttpServletRequest req,
				@RequestBody final DRRequestData<ShiftDetailsDTO> drRequestData) {
			final ShiftDetailsDTO shiftDTO = new ShiftDetailsDTO();

			shiftDTO.setShiftFromTime(drRequestData.getRequestData().getShiftFromTime());
			shiftDTO.setShiftToTime(drRequestData.getRequestData().getShiftToTime());
			shiftDTO.setShiftHrs(drRequestData.getRequestData().getShiftHrs());

			System.out.println("Service invoked");

			System.out.println("shiftStartTime " + drRequestData.getRequestData().getShiftFromTime());

			System.out.println("shiftEndTime " + drRequestData.getRequestData().getShiftToTime());
			System.out.println("shiftHrs " + drRequestData.getRequestData().getShiftHrs());

			masterDataService.createshift(shiftDTO);
			
			final DRResponseData<String> drResponseData = new DRResponseData<String>(1234l, DRResponseStatus.SUCCESS);
			return drResponseData;
		}

		//LoanController
		
		@RequestMapping(value = "/createloan", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
		public @ResponseBody DRResponseData<String> createloan(final HttpServletRequest req,
				@RequestBody final DRRequestData<LoanDetailsDTO> drRequestData) {
			final LoanDetailsDTO loanDTO = new LoanDetailsDTO();
			
			loanDTO.setLoanDesc(drRequestData.getRequestData().getLoanDesc());
			loanDTO.setMaxLoanAmount(drRequestData.getRequestData().getMaxLoanAmount());
			loanDTO.setMaxNumOfInst(drRequestData.getRequestData().getMaxNumOfInst());
			//loanDTO.setLoanInterest(drRequestData.getRequestData().getLoanInterest());
			loanDTO.setInterestRate(drRequestData.getRequestData().getInterestRate());
			loanDTO.setNextLoanAvailability(drRequestData.getRequestData().getNextLoanAvailability());
			
			System.out.println("Service invoked");

			System.out.println("Loan Desc: " + drRequestData.getRequestData().getLoanDesc());
			System.out.println("MaxLoanAmount: " + drRequestData.getRequestData().getMaxLoanAmount());
			System.out.println("MaxNumInst: " + drRequestData.getRequestData().getMaxNumOfInst());
			//System.out.println("loanInterest: " + drRequestData.getRequestData().getLoanInterest());
			System.out.println("loanInterestrate: " + drRequestData.getRequestData().getInterestRate());
			System.out.println("Nextloanavailability: " + drRequestData.getRequestData().getNextLoanAvailability());

			
			
			masterDataService.createloan(loanDTO);
			
			final DRResponseData<String> drResponseData = new DRResponseData<String>(1234l, DRResponseStatus.SUCCESS);
			return drResponseData;
		}
		
		//Punishment module
		
		@RequestMapping(value = "/createpunishment", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
		public @ResponseBody DRResponseData<String> createpunishment(final HttpServletRequest req,
				@RequestBody final DRRequestData<PunishmentDetailsDTO> drRequestData) {
			final PunishmentDetailsDTO punishDTO = new PunishmentDetailsDTO();

			/*shiftDTO.setShiftFromTime(drRequestData.getRequestData().getShiftFromTime());
			shiftDTO.setShiftToTime(drRequestData.getRequestData().getShiftToTime());
			shiftDTO.setShiftHrs(drRequestData.getRequestData().getShiftHrs());*/

			punishDTO.setEmpId(drRequestData.getRequestData().getEmpId());
			punishDTO.setPunishment(drRequestData.getRequestData().getPunishment());
			punishDTO.setFinancialLoss(drRequestData.getRequestData().getFinancialLoss());
			punishDTO.setPunishDate(drRequestData.getRequestData().getPunishDate());
			
			System.out.println("Service invoked");

			System.out.println("EmpId: " + drRequestData.getRequestData().getEmpId());
			System.out.println("Punishment: " + drRequestData.getRequestData().getPunishment());
			System.out.println("FinancialLoss: " + drRequestData.getRequestData().getFinancialLoss());
			System.out.println("PunishDate: " + drRequestData.getRequestData().getPunishDate());

			masterDataService.createpunishment(punishDTO);
			
			final DRResponseData<String> drResponseData = new DRResponseData<String>(1234l, DRResponseStatus.SUCCESS);
			return drResponseData;
		}
		@RequestMapping(value = "/holidayList", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
		public @ResponseBody DRResponseData<List<Cadre>> getHolidayList(final HttpServletRequest request) {
			final DRResponseData<List<Cadre>> drResponse = new DRResponseData<List<Cadre>>(1234, getHolidayList());
			System.out.println("hi...from holidayList");
			drResponse.setDrResponseStatus(DRResponseStatus.SUCCESS);
			return drResponse;
		}

		@RequestMapping(value = "/createHolidayList", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
		public @ResponseBody DRResponseData<String> createHolidayDetails(final HttpServletRequest req,
				@RequestBody final DRRequestData<HolidayDetailDTO> drRequestData) {
			final HolidayDetailDTO holDetDTO = new HolidayDetailDTO();
			holDetDTO.setHolDesc(drRequestData.getRequestData().getHolDesc());
			holDetDTO.setHolDate(drRequestData.getRequestData().getHolDate());
			System.out.println("Holiday Description: " + drRequestData.getRequestData().getHolDesc());
			// System.out.println("First Name " +
			// drRequestData.getRequestData().getFirstName());
			masterDataService.createHolidayDetails(holDetDTO);
			final DRResponseData<String> drResponseData = new DRResponseData<String>(1234l, DRResponseStatus.SUCCESS);
			return drResponseData;
		}
		@RequestMapping(value = "/bankName", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
		public @ResponseBody DRResponseData<List<Bank>> getBankDetails(final HttpServletRequest request) {
			final DRResponseData<List<Bank>> drResponse = new DRResponseData<List<Bank>>(1234, getBankDetails());
			System.out.println("hi...from holidayList");
			drResponse.setDrResponseStatus(DRResponseStatus.SUCCESS);
			System.out.println(drResponse);
			return drResponse;
			
		}
		@RequestMapping(value = "/modifyBank", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
		public @ResponseBody DRResponseData<String> createBankDetails(final HttpServletRequest req,
				@RequestBody final DRRequestData<BankDetailsDTO> drRequestData) {
			final BankDetailsDTO bnkDetDTO = new BankDetailsDTO();
			bnkDetDTO.setNaMe(drRequestData.getRequestData().getNaMe());
			bnkDetDTO.setBranchName(drRequestData.getRequestData().getBranchName());
			bnkDetDTO.setStationName(drRequestData.getRequestData().getStationName());
			bnkDetDTO.setIfscCode(drRequestData.getRequestData().getIfscCode());
			bnkDetDTO.setMicrCode(drRequestData.getRequestData().getMicrCode());
			bnkDetDTO.setConTact(drRequestData.getRequestData().getConTact());
			System.out.println("Bank Name " + drRequestData.getRequestData().getNaMe());
			System.out.println("Branch Name " + drRequestData.getRequestData().getBranchName());
			System.out.println("Station Name " + drRequestData.getRequestData().getStationName());
			System.out.println("IFSC code" + drRequestData.getRequestData().getIfscCode());
			System.out.println("MICR code " + drRequestData.getRequestData().getMicrCode());
			System.out.println("Conatct " + drRequestData.getRequestData().getConTact());
			masterDataService.createBankDetails(bnkDetDTO);
			final DRResponseData<String> drResponseData = new DRResponseData<String>(1234l, DRResponseStatus.SUCCESS);
			return drResponseData;
		}

		@RequestMapping(value = "/createContractor", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
		public @ResponseBody DRResponseData<String> createContractorDetails(final HttpServletRequest req,
				@RequestBody final DRRequestData<Contractor> drRequestData) {
			
			System.out.println("Bank Name " + drRequestData.getRequestData().getContrName());
			System.out.println("Branch Name " + drRequestData.getRequestData().getContrAddress());
			System.out.println("Station Name " + drRequestData.getRequestData().getContrContact());
			System.out.println("IFSC code" + drRequestData.getRequestData().getContrTin());
			System.out.println("MICR code " + drRequestData.getRequestData().getContrPan());
			System.out.println("Conatct " + drRequestData.getRequestData().getContrSpoc());
			masterDataService.createContractorDetails(drRequestData.getRequestData());
			final DRResponseData<String> drResponseData = new DRResponseData<String>(1234l, DRResponseStatus.SUCCESS);
			return drResponseData;
		}

		// Increment Controller

		@RequestMapping(value = "/modifyIncrement", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
		public @ResponseBody DRResponseData<String> createIncrementDetails(final HttpServletRequest req,
				@RequestBody final DRRequestData<IncrementDetailsDTO> drRequestData) {
			final IncrementDetailsDTO incrDetDTO = new IncrementDetailsDTO();
			incrDetDTO.setEmpID(drRequestData.getRequestData().getEmpID());
			incrDetDTO.setNxtDate(drRequestData.getRequestData().getNxtDate());
			incrDetDTO.setIncrRate(drRequestData.getRequestData().getIncrRate());
			System.out.println("srevice invoked......");
			System.out.println("Employee Id " + drRequestData.getRequestData().getEmpID());
			System.out.println("Next Increment Date " + drRequestData.getRequestData().getNxtDate());
			System.out.println("Increment Rate " + drRequestData.getRequestData().getIncrRate());
			masterDataService.createIncrementDetails(incrDetDTO);
			final DRResponseData<String> drResponseData = new DRResponseData<String>(1234l, DRResponseStatus.SUCCESS);
			return drResponseData;
		}
		

		/* @RequestMapping(value = "/holidayList", method = RequestMethod.GET) */
		public List<Cadre> getHolidayList() {
			List<Cadre> holList = new ArrayList<Cadre>();

			holList = masterDataService.getHolidayList(); // here to will call the service
													// layer
			System.out.println("reson type end");
			return holList;
		}

		public List<Location> getLocationList() {
			List<Location> locList = new ArrayList<Location>();

			locList = masterDataService.getLocationList(); // here to will call the service
													// layer
			System.out.println("reson type end");
			return locList;
		}

		public List<Bank> getBankDetails() {
			List<Bank> bnkdt = new ArrayList<Bank>();

			bnkdt = masterDataService.getBankDetails(); // here to will call the service
													// layer
			System.out.println("reson type end");
			return bnkdt;
		}


}
