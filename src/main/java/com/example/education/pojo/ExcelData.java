package com.example.education.pojo;

/**
 * Created by ding.jiatian on 2019/5/10.
 */
public class ExcelData {
    //dept 项目部 ZS 招生分析 简称dZS, 学生基础信息
    private String dZSbaseINfo;
    //历年录取人数
    private String dZShistoryStudentNum;
    //    项目部招生分析---历年专业录取人数：
    private String dZShistoryMajorStudentNum;
    //    项目部招生分析---历年报到率：
    private String dZShistoryMajorReportStudentReport;
    //    项目部招生分析---历年专业报到人数：
    private String dZShistoryMajorReportStudentNum;
    //    项目部招生分析---历年缴费率：
    private String dZShistoryMajorPayStudentReport;
    //    项目部招生分析---历年专业缴费人数： 同’ 历年专业报到人数 ‘调用一个方法
    private String dZShistoryMajorPayStudentNum;

    //dept 项目部 JS就业分析 简称dJS
    //    项目部就业分析---专业就业率：
    private String dJSmajorObtainReport;
    //    项目部就业分析---就业满意度：
    private String dJSobtainSatisfied;
    //    项目部就业分析---专业对口率：
    private String dJSisMajorRatio;
    //    项目部就业分析---男女生就业率对比：
    private String dJSsexObtainRatio;

    //dept 项目部 XX学习分析 简称dXX
    //    项目部学习分析---历年总平均成绩：
    private String dXXaverageGradeHistory;
    //    项目部学习分析---历年专业平均成绩：
    private String dXXmajorAverageGradeHistory;

    //教师分析  师资分析 terSZ
    //    教师师资分析---历年团队人数：
    private String terSZhistoryDepartmentNum;
    //    教师师资分析---工程师占比：
    private String terSZengineerProportion;
    //    教师师资分析---各专业历年教师人数：
    private String terSZmajorTeacherNumHistory;
    //    教师师资分析---工程师行业背景：
    private String terSZengineerCareer;

    //教师分析  工作分析 terGZ
    //    教师工作分析---资源开发分析：
    private String terGZresource;
    //    教师工作分析---历年课时数量：
    private String terGZclassHourHistory;

    //教师分析  工作分析 terKS
    //    教师课时分析---线下课时总数：
    private String terKSofflineHoursTotal;
    //    教师课时分析---线下课程总数：
    private String terKSofflineCourseTotal;

    //教学资源分析 tinZY
    //    教学资源分析---基本信息：
    private String tinZYbaseInfo;
    //    教学资源分析---历年课程数量：
    private String tinZYcurriculumHistory;
    //    教学资源分析---历年专业课程数量：
    private String tinZYmajorCurriculumHistory;
    //    教学资源分析---历年教材数量：
    private String tinZYteachingMaterial;
    //    教学资源分析---历年专业教材数量：
    private String tinZYmajorTeachingMaterial;

    //教学运营分析 tinYY
    //    教学运营分析---基本信息：
    private String tinYYbaseInfo;
    //    教学运营分析---满意度调查：
    private String tinYYsatisfactionSurvey;
    //    教学运营分析---团队结构：
    private String tinYYteamStructure;

    private String flagA;

    public String getFlagA() {
        return flagA;
    }

    public void setFlagA(String flagA) {
        this.flagA = flagA;
    }

    public String getdZSbaseINfo() {
        return dZSbaseINfo;
    }

    public void setdZSbaseINfo(String dZSbaseINfo) {
        this.dZSbaseINfo = dZSbaseINfo;
    }

    public String getdZShistoryStudentNum() {
        return dZShistoryStudentNum;
    }

    public void setdZShistoryStudentNum(String dZShistoryStudentNum) {
        this.dZShistoryStudentNum = dZShistoryStudentNum;
    }

    public String getdZShistoryMajorStudentNum() {
        return dZShistoryMajorStudentNum;
    }

    public void setdZShistoryMajorStudentNum(String dZShistoryMajorStudentNum) {
        this.dZShistoryMajorStudentNum = dZShistoryMajorStudentNum;
    }

    public String getdZShistoryMajorReportStudentReport() {
        return dZShistoryMajorReportStudentReport;
    }

    public void setdZShistoryMajorReportStudentReport(String dZShistoryMajorReportStudentReport) {
        this.dZShistoryMajorReportStudentReport = dZShistoryMajorReportStudentReport;
    }

    public String getdZShistoryMajorReportStudentNum() {
        return dZShistoryMajorReportStudentNum;
    }

    public void setdZShistoryMajorReportStudentNum(String dZShistoryMajorReportStudentNum) {
        this.dZShistoryMajorReportStudentNum = dZShistoryMajorReportStudentNum;
    }

    public String getdZShistoryMajorPayStudentReport() {
        return dZShistoryMajorPayStudentReport;
    }

    public void setdZShistoryMajorPayStudentReport(String dZShistoryMajorPayStudentReport) {
        this.dZShistoryMajorPayStudentReport = dZShistoryMajorPayStudentReport;
    }

    public String getdZShistoryMajorPayStudentNum() {
        return dZShistoryMajorPayStudentNum;
    }

    public void setdZShistoryMajorPayStudentNum(String dZShistoryMajorPayStudentNum) {
        this.dZShistoryMajorPayStudentNum = dZShistoryMajorPayStudentNum;
    }

    public String getdJSmajorObtainReport() {
        return dJSmajorObtainReport;
    }

    public void setdJSmajorObtainReport(String dJSmajorObtainReport) {
        this.dJSmajorObtainReport = dJSmajorObtainReport;
    }

    public String getdJSobtainSatisfied() {
        return dJSobtainSatisfied;
    }

    public void setdJSobtainSatisfied(String dJSobtainSatisfied) {
        this.dJSobtainSatisfied = dJSobtainSatisfied;
    }

    public String getdJSisMajorRatio() {
        return dJSisMajorRatio;
    }

    public void setdJSisMajorRatio(String dJSisMajorRatio) {
        this.dJSisMajorRatio = dJSisMajorRatio;
    }

    public String getdJSsexObtainRatio() {
        return dJSsexObtainRatio;
    }

    public void setdJSsexObtainRatio(String dJSsexObtainRatio) {
        this.dJSsexObtainRatio = dJSsexObtainRatio;
    }

    public String getdXXaverageGradeHistory() {
        return dXXaverageGradeHistory;
    }

    public void setdXXaverageGradeHistory(String dXXaverageGradeHistory) {
        this.dXXaverageGradeHistory = dXXaverageGradeHistory;
    }

    public String getdXXmajorAverageGradeHistory() {
        return dXXmajorAverageGradeHistory;
    }

    public void setdXXmajorAverageGradeHistory(String dXXmajorAverageGradeHistory) {
        this.dXXmajorAverageGradeHistory = dXXmajorAverageGradeHistory;
    }

    public String getTerSZhistoryDepartmentNum() {
        return terSZhistoryDepartmentNum;
    }

    public void setTerSZhistoryDepartmentNum(String terSZhistoryDepartmentNum) {
        this.terSZhistoryDepartmentNum = terSZhistoryDepartmentNum;
    }

    public String getTerSZengineerProportion() {
        return terSZengineerProportion;
    }

    public void setTerSZengineerProportion(String terSZengineerProportion) {
        this.terSZengineerProportion = terSZengineerProportion;
    }

    public String getTerSZmajorTeacherNumHistory() {
        return terSZmajorTeacherNumHistory;
    }

    public void setTerSZmajorTeacherNumHistory(String terSZmajorTeacherNumHistory) {
        this.terSZmajorTeacherNumHistory = terSZmajorTeacherNumHistory;
    }

    public String getTerSZengineerCareer() {
        return terSZengineerCareer;
    }

    public void setTerSZengineerCareer(String terSZengineerCareer) {
        this.terSZengineerCareer = terSZengineerCareer;
    }

    public String getTerGZresource() {
        return terGZresource;
    }

    public void setTerGZresource(String terGZresource) {
        this.terGZresource = terGZresource;
    }

    public String getTerGZclassHourHistory() {
        return terGZclassHourHistory;
    }

    public void setTerGZclassHourHistory(String terGZclassHourHistory) {
        this.terGZclassHourHistory = terGZclassHourHistory;
    }

    public String getTerKSofflineHoursTotal() {
        return terKSofflineHoursTotal;
    }

    public void setTerKSofflineHoursTotal(String terKSofflineHoursTotal) {
        this.terKSofflineHoursTotal = terKSofflineHoursTotal;
    }

    public String getTerKSofflineCourseTotal() {
        return terKSofflineCourseTotal;
    }

    public void setTerKSofflineCourseTotal(String terKSofflineCourseTotal) {
        this.terKSofflineCourseTotal = terKSofflineCourseTotal;
    }

    public String getTinZYbaseInfo() {
        return tinZYbaseInfo;
    }

    public void setTinZYbaseInfo(String tinZYbaseInfo) {
        this.tinZYbaseInfo = tinZYbaseInfo;
    }

    public String getTinZYcurriculumHistory() {
        return tinZYcurriculumHistory;
    }

    public void setTinZYcurriculumHistory(String tinZYcurriculumHistory) {
        this.tinZYcurriculumHistory = tinZYcurriculumHistory;
    }

    public String getTinZYmajorCurriculumHistory() {
        return tinZYmajorCurriculumHistory;
    }

    public void setTinZYmajorCurriculumHistory(String tinZYmajorCurriculumHistory) {
        this.tinZYmajorCurriculumHistory = tinZYmajorCurriculumHistory;
    }

    public String getTinZYteachingMaterial() {
        return tinZYteachingMaterial;
    }

    public void setTinZYteachingMaterial(String tinZYteachingMaterial) {
        this.tinZYteachingMaterial = tinZYteachingMaterial;
    }

    public String getTinZYmajorTeachingMaterial() {
        return tinZYmajorTeachingMaterial;
    }

    public void setTinZYmajorTeachingMaterial(String tinZYmajorTeachingMaterial) {
        this.tinZYmajorTeachingMaterial = tinZYmajorTeachingMaterial;
    }

    public String getTinYYbaseInfo() {
        return tinYYbaseInfo;
    }

    public void setTinYYbaseInfo(String tinYYbaseInfo) {
        this.tinYYbaseInfo = tinYYbaseInfo;
    }

    public String getTinYYsatisfactionSurvey() {
        return tinYYsatisfactionSurvey;
    }

    public void setTinYYsatisfactionSurvey(String tinYYsatisfactionSurvey) {
        this.tinYYsatisfactionSurvey = tinYYsatisfactionSurvey;
    }

    public String getTinYYteamStructure() {
        return tinYYteamStructure;
    }

    public void setTinYYteamStructure(String tinYYteamStructure) {
        this.tinYYteamStructure = tinYYteamStructure;
    }
}
