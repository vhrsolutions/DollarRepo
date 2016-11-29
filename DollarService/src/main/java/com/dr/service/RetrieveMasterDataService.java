/**
 * 
 */
package com.dr.service;

import java.util.List;

import com.dr.bean.EmploymentType;
import com.dr.bean.ShiftModReason;
import com.dr.db.entity.Bank;
import com.dr.db.entity.Cadre;
import com.dr.db.entity.Contractor;
import com.dr.db.entity.Department;
import com.dr.db.entity.Location;
import com.dr.dto.BankDetailsDTO;
import com.dr.dto.HolidayDetailDTO;
import com.dr.dto.IncrementDetailsDTO;
import com.dr.dto.LoanDetailsDTO;
import com.dr.dto.PunishmentDetailsDTO;
import com.dr.dto.ShiftDetailsDTO;

/**
 * @author Vaishnavie
 *
 */
public interface RetrieveMasterDataService {
	
	public EmploymentType getEmploymentType();
	public ShiftModReason getShiftModificationReason();
	public List<Department> getDepartmentDetails();
	public void createAddLocation(Location location);
	public void updateData(Cadre cdto);
	public void createshift(ShiftDetailsDTO shiftDTO);
	public void createloan(LoanDetailsDTO loanDTO);
	public void createpunishment(PunishmentDetailsDTO punishDTO);
	public Location getLocationData(Location location);
	public List<String> getAllLocation();
	public void createHolidayDetails(HolidayDetailDTO holDetDTO);
	public List<Cadre> getHolidayList();
	public List<Location> getLocationList();
	public void createBankDetails(BankDetailsDTO bnkDetDTO);
	public void createContractorDetails(Contractor contr);
	public void createIncrementDetails(IncrementDetailsDTO incrDetDTO);
	public List<Bank> getBankDetails();

}
