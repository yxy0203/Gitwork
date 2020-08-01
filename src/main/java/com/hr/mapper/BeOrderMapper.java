package com.hr.mapper;

import com.hr.entity.BeOrder;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;


public interface BeOrderMapper {

    @Insert("insert into be_order (OrderNo, OrderType, StepID, \n" +
            "      CreateEmp, CreateDate, CompleteEmp, \n" +
            "      CompleteDate, LastEditEmp, LastEditDate, \n" +
            "      UserName, UserType, Address, \n" +
            "      LinkMan, Phone, UseTarget, \n" +
            "      HouseHeight, MaxAmount, MeterTypeID, \n" +
            "      MeterCount, UserRemark, PayType, \n" +
            "      BankCompany, BankNum, OldUserNo, \n" +
            "      OldUserName, OldUserPhone, OldUserAddr, \n" +
            "      OldMeter, AuditEmpID, AuditMessage, \n" +
            "      ProjectMoney, RealMoney, PayDate, \n" +
            "      ProjectDate1, ProjectDate2, AreaID, \n" +
            "      AbortCause)\n" +
            "    values (#{orderno,jdbcType=VARCHAR}, #{ordertype,jdbcType=INTEGER}, #{stepid,jdbcType=INTEGER}, \n" +
            "      #{createemp,jdbcType=INTEGER}, #{createdate,jdbcType=TIMESTAMP}, #{completeemp,jdbcType=INTEGER}, \n" +
            "      #{completedate,jdbcType=TIMESTAMP}, #{lasteditemp,jdbcType=INTEGER}, #{lasteditdate,jdbcType=TIMESTAMP}, \n" +
            "      #{username,jdbcType=VARCHAR}, #{usertype,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, \n" +
            "      #{linkman,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, #{usetarget,jdbcType=VARCHAR}, \n" +
            "      #{househeight,jdbcType=INTEGER}, #{maxamount,jdbcType=INTEGER}, #{metertypeid,jdbcType=INTEGER}, \n" +
            "      #{metercount,jdbcType=INTEGER}, #{userremark,jdbcType=VARCHAR}, #{paytype,jdbcType=VARCHAR}, \n" +
            "      #{bankcompany,jdbcType=VARCHAR}, #{banknum,jdbcType=VARCHAR}, #{olduserno,jdbcType=VARCHAR}, \n" +
            "      #{oldusername,jdbcType=VARCHAR}, #{olduserphone,jdbcType=VARCHAR}, #{olduseraddr,jdbcType=VARCHAR}, \n" +
            "      #{oldmeter,jdbcType=VARCHAR}, #{auditempid,jdbcType=INTEGER}, #{auditmessage,jdbcType=VARCHAR}, \n" +
            "      #{projectmoney,jdbcType=DECIMAL}, #{realmoney,jdbcType=DECIMAL}, #{paydate,jdbcType=TIMESTAMP}, \n" +
            "      #{projectdate1,jdbcType=TIMESTAMP}, #{projectdate2,jdbcType=TIMESTAMP}, #{areaid,jdbcType=INTEGER}, \n" +
            "      #{abortcause,jdbcType=VARCHAR})")
    public void addKh();
}