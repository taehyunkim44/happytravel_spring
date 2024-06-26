package kr.happytravel.erp.sales.service;

import kr.happytravel.erp.sales.model.sales.packages.*;


import java.util.List;
import java.util.Map;

public interface PackageService {
    // 전체 조회
    List<PackageListDTO> getPackageList(Map<String, Object> paramMap) throws Exception;

    // 전체 조회 카운트
    int getPackageCnt(Map<String, Object> paramMap) throws Exception;

    // 단건 등록
    int insertPackage(Map<String, Object> paramMap) throws Exception;

    // 단건 수정
    int updatePackage(Map<String, Object> paramMap) throws Exception;

    // 단건 삭제
    int updatePackageYN(Map<String, Object> paramMap) throws Exception;

    // 패키지  assign 승인 or 반려, default 대기중 1000
    int assignPackage(Map<String, Object> paramMap) throws Exception;
    // 단건조회 with 항공권,호텔,여행사
    PackageDTO selectPackage (Map<String, Object> paramMap) throws Exception;

    List<CountryDTO> getCountries (Map<String, Object> paramMap) throws Exception;

    List<PartnerListDTO> getFlightList(Map<String, Object> paramMap) throws Exception;

    int getFlightCnt(Map<String, Object> paramMap) throws Exception;

    List<PartnerListDTO> getHotelList(Map<String, Object> paramMap) throws Exception;

    int getHotelCnt(Map<String, Object> paramMap) throws Exception;

    List<PartnerListDTO> getAgencyList(Map<String, Object> paramMap) throws Exception;

    int getAgencyCnt(Map<String, Object> paramMap) throws Exception;
}