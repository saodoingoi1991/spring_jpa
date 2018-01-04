package bhxh.utils;

public class Config {
    //    public static final String URL_SERVICE_VSA = "http://other.tst.vsaservice:8213/vsaService/ws/vsa.wsdl?wsdl";
    public static final String URL_SERVICE_VSA = "http://10.0.119.31:8213/vsaService/ws/vsa.wsdl?wsdl";
    public static final String SERVICE_QLNS_URL = "http://qlns.baohiemxahoi.gov.vn/Service/ServiceDmDonVi.asmx?wsdl";
    public static final String URL_SERVICE_DANH_MUC = "http://other.giamdinh.danhmuc:8080/Danhmuc.asmx";
    public static final String SOAPACTION_DM_BHXH_SOA = "vsaService/ws/getDmBhxhSOA";
    public static final String SOAPACTION_DM_DON_VI_SOA = "vsaService/ws/getDmDonViSOA";
    public static final String SOAPACTION_DM_KHOI_KCB_SOA = "vsaService/ws/getDmKhoiKcbSOA";
    public static final String SOAPACTION_DM_KHOI_TK_SOA = "vsaService/ws/getDmKhoiTkSOA";
    public static final String SOAPACTION_DM_KHOI_QL_SOA = "vsaService/ws/getDmKhoiQlSOA";
    public static final String SOAPACTION_DM_NGHIEP_VU_SOA = "vsaService/ws/getDmNghiepVuSOA";
    public static final String SOAPACTION_DM_CSKCB_SOA = "http://tempuri.org/get_list_cosokcb";
    public static final String SOAPACTION_DM_PHONG_BAN_SOA = "http://qlcb.DmDonVi.soa/GetDmDonVi";

    public static final String VSA_NAMESPACE = "http://teca.com/sms/generated/ws/vsa";
    public static final String DANHMUC_NAMESPACE = "http://tempuri.org";
    public static final String QLNS_NAMESPACE = "http://qlcb.DmDonVi.soa/";

    public static final String NAMESPACE_USER = "http://IAM.SyncConfig.soa/";


    //Danh muc
    public static final String COMMON_DM_DBHC = "COMMON_DM_DBHC";
    public static final String COMMON_DM_CQBH_TINH = "COMMON_DM_CQBH_TINH";
    public static final String COMMON_DM_CQBH_HUYEN = "COMMON_DM_CQBH_HUYEN";
    public static final String COMMON_DM_LUONG_TRAN = "COMMON_DM_LUONG_TRAN";
    public static final String COMMON_DM_NGAN_HANG = "COMMON_DM_NGAN_HANG";
    public static final String COMMON_DM_PHONG_BAN = "COMMON_DM_PHONG_BAN";
    public static final String COMMON_DM_QUOC_TICH = "COMMON_DM_QUOC_TICH";

    public static final String COMMON_DM_KHOI_KCB = "COMMON_DM_KHOI_KCB";//COMMON_DM_KHOI_KCB
    public static final String COMMON_DM_CSKCB = "COMMON_DM_CSKCB";//COMMON_DM_CSKCB
    public static final String COMMON_DM_DON_VI = "COMMON_DM_DON_VI";//COMMON_DM_DON_VI
    public static final String COMMON_DM_KHOI_QUAN_LY = "COMMON_DM_KHOI_QUAN_LY";//COMMON_DM_KHOI_QUAN_LY
    public static final String COMMON_DM_KHOI_THONG_KE = "COMMON_DM_KHOI_THONG_KE";//COMMON_DM_KHOI_THONG_KE
    public static final String COMMON_DM_NGHIEP_VU = "COMMON_DM_NGHIEP_VU";//COMMON_DM_NGHIEP_VU


    public static final Integer STATUS_CATEGORY_VERIFY = 4;
    public static final Integer STATUS_CATEGORY = 2;
    //

    public static final String SQL_PROC_KHOI_KCB = "{call PKG_CM_DM_KHOI_KCB.VERIFY_COMMON_DM_KHOI_KCB(:p_arr,:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_KHOI_TK = "{call PKG_CM_DM_KHOI_TK.VERIFY_COMMON_DM_KHOI_TK(:p_arr,:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_KHOI_QL = "{call PKG_CM_DM_KHOI_QL.VERIFY_COMMON_DM_KHOI_QL(:p_arr,:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_CSKCB = "{call PKG_CM_DM_CSKCB.verify_common_dm_cskcb(:p_arr,:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_DON_VI = "{call PKG_CM_DM_DON_VI.VERIFY_COMMON_DM_DON_VI(:p_arr,:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_NGHIEP_VU = "{call PKG_CM_DM_NGHIEP_VU.VERIFY_COMMON_DM_NGHIEP_VU(:p_arr,:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_PHONG_BAN = "{call PKG_CM_DM_PHONG_BAN.verify_common_dm_phong_ban(:p_arr,:p_output_code,:p_output_msg)}";

    public static final String SQL_PROC_EXEC_KHOI_KCB = "{call PKG_CM_DM_KHOI_KCB.EXEC_VERIFY_COMMON_DM_KHOI_KCB(:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_EXEC_KHOI_TK = "{call PKG_CM_DM_KHOI_TK.EXEC_VERIFY_COMMON_DM_KHOI_TK(:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_EXEC_KHOI_QL = "{call PKG_CM_DM_KHOI_QL.EXEC_VERIFY_COMMON_DM_KHOI_QL(:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_EXEC_CSKCB = "{call PKG_CM_DM_CSKCB.EXEC_verify_common_dm_cskcb(:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_EXEC_DON_VI = "{call PKG_CM_DM_DON_VI.EXEC_VERIFY_COMMON_DM_DON_VI(:p_month,:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_EXEC_NGHIEP_VU = "{call PKG_CM_DM_NGHIEP_VU.EXEC_VERIFY_CM_DM_NGHIEP_VU(:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_EXEC_PHONG_BAN = "{call PKG_CM_DM_PHONG_BAN.exec_verify_cm_dm_phong_ban(:p_output_code,:p_output_msg)}";

    public static final String SQL_PROC_SYNC_KHOI_KCB = "{call PKG_CM_DM_KHOI_KCB.SYNC_CM_DM_KHOI_KCB(:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_SYNC_KHOI_TK = "{call PKG_CM_DM_KHOI_TK.sync_cm_dm_khoi_tk(:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_SYNC_KHOI_QL = "{call PKG_CM_DM_KHOI_QL.sync_cm_dm_khoi_ql(:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_SYNC_CSKCB = "{call PKG_CM_DM_CSKCB.sync_cm_dm_cskcb(:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_SYNC_DON_VI = "{call PKG_CM_DM_DON_VI.sync_cm_dm_don_vi(:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_SYNC_NGHIEP_VU = "{call PKG_CM_DM_NGHIEP_VU.sync_cm_dm_nghiep_vu(:p_output_code,:p_output_msg)}";

    public static final String SQL_PROC_DEL_KHOI_KCB = "{call PKG_CM_DM_KHOI_KCB.del_cm_dm_khoi_kcb(:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_DEL_KHOI_TK = "{call PKG_CM_DM_KHOI_TK.del_cm_dm_khoi_tk(:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_DEL_KHOI_QL = "{call PKG_CM_DM_KHOI_QL.del_cm_dm_khoi_ql(:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_DEL_CSKCB = "{call PKG_CM_DM_CSKCB.del_cm_dm_cskcb(:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_DEL_DON_VI = "{call PKG_CM_DM_DON_VI.del_cm_dm_don_vi(:p_month,:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_DEL_NGHIEP_VU = "{call PKG_CM_DM_NGHIEP_VU.del_cm_dm_nghiep_vu(:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_DEL_PHONG_BAN = "{call pkg_cm_dm_phong_ban.del_cm_dm_phong_ban(:p_output_code,:p_output_msg)}";

    public static final String SQL_PROC_DIRECT_KHOI_KCB = "{call PKG_CM_DM_KHOI_KCB.sync_direct_common_dm_khoi_kcb(:p_arr,:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_DIRECT_KHOI_TK = "{call PKG_CM_DM_KHOI_TK.sync_direct_common_dm_khoi_tk(:p_arr,:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_DIRECT_KHOI_QL = "{call PKG_CM_DM_KHOI_QL.sync_direct_common_dm_khoi_ql(:p_arr,:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_DIRECT_CSKCB = "{call PKG_CM_DM_CSKCB.sync_direct_common_dm_cskcb(:p_arr,:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_DIRECT_DON_VI = "{call PKG_CM_DM_DON_VI.sync_direct_common_dm_don_vi(:p_arr,:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_DIRECT_NGHIEP_VU = "{call PKG_CM_DM_NGHIEP_VU.sync_direct_cm_dm_nghiep_vu(:p_arr,:p_output_code,:p_output_msg)}";
    public static final String SQL_PROC_DIRECT_PHONG_BAN = "{call pkg_cm_dm_phong_ban.sync_direct_cm_dm_pb(:p_arr,:p_output_code,:p_output_msg)}";

    public static final String TABLE_CM_DM_NGHIEP_VU = "TABLE_CM_DM_NGHIEP_VU";
    public static final String TABLE_CM_DM_KHOI_KCB = "TABLE_CM_DM_KHOI_KCB";
    public static final String TABLE_CM_DM_KHOI_TK = "TABLE_CM_DM_KHOI_TK";
    public static final String TABLE_CM_DM_KHOI_QL = "TABLE_CM_DM_KHOI_QL";
    public static final String TABLE_CM_DM_CSKCB = "TABLE_CM_DM_CSKCB";
    public static final String TABLE_CM_DM_DON_VI = "TABLE_CM_DM_DON_VI";
    public static final String TABLE_CM_DM_PHONG_BAN = "TABLE_CM_DM_PHONG_BAN";


    public static final String OBJECT_CM_DM_KHOI_KCB = "OBJECT_CM_DM_KHOI_KCB";
    public static final String OBJECT_CM_DM_KHOI_TK = "OBJECT_CM_DM_KHOI_TK";
    public static final String OBJECT_CM_DM_KHOI_QL = "OBJECT_CM_DM_KHOI_QL";
    public static final String OBJECT_CM_DM_NGHIEP_VU = "OBJECT_CM_DM_NGHIEP_VU";
    public static final String OBJECT_CM_DM_CSKCB = "OBJECT_CM_DM_CSKCB";
    public static final String OBJECT_CM_DM_DON_VI = "OBJECT_CM_DM_DON_VI";
    public static final String OBJECT_CM_DM_PHONG_BAN = "OBJECT_CM_DM_PHONG_BAN";


}
