package kr.happytravel.erp.attendances.service;

import kr.happytravel.erp.attendances.dao.AttendanceManagementDao;
import kr.happytravel.erp.attendances.model.AttendanceConfirmResponse;
import kr.happytravel.erp.attendances.model.AttendanceManageResponse;
import kr.happytravel.erp.attendances.model.AttendanceManagementModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class AttendanceManagementServiceImpl implements AttendanceManagementService {


    private final AttendanceManagementDao attendanceManagementDao;

    @Override
    public List<AttendanceManageResponse> getAttendanceManagementList() throws Exception {
        return attendanceManagementDao.getAttendanceManagementList();
    }

    @Override
    public void updateAssignCodeToApproved(String AttendanceCode) throws Exception {
        attendanceManagementDao.updateAssignCodeToApproved(AttendanceCode);
    }

    @Override
    public void updateAssignCodeToRejected(String AttendanceCode) throws Exception {
        attendanceManagementDao.updateAssignCodeToRejected(AttendanceCode);
    }

    @Override
    public List<AttendanceConfirmResponse> getAttendanceConfirmList() throws Exception {
        return attendanceManagementDao.getAttendanceConfirmList();
    }


    @Override
    public AttendanceManagementModel selectAttendanceManagement(Map<String, Object> paramMap) throws Exception {
        return attendanceManagementDao.selectAttendanceManagement(paramMap);
    }

    @Override
    public int insertAttendanceManagement(AttendanceManagementModel attendanceManagement) throws Exception {
        return attendanceManagementDao.insertAttendanceManagement(attendanceManagement);
    }

    @Override
    public int updateAttendanceManagement(AttendanceManagementModel attendanceManagement) throws Exception {
        return attendanceManagementDao.updateAttendanceManagement(attendanceManagement);
    }

    @Override
    public int deleteAttendanceManagement(Map<String, Object> paramMap) throws Exception {
        return attendanceManagementDao.deleteAttendanceManagement(paramMap);
    }

    @Override
    public String getMaxAttendanceTypeCode(String creationDate) throws Exception {
        return attendanceManagementDao.getMaxAttendanceTypeCode(creationDate);
    }

    @Override
    public String getManagerIdByDeptCode(String deptCode) throws Exception {
        return attendanceManagementDao.getManagerIdByDeptCode(deptCode);
    }
}
