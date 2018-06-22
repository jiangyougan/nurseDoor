package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NursingReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NursingReportExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andNursingReportidIsNull() {
            addCriterion("\"nursing reportid\" is null");
            return (Criteria) this;
        }

        public Criteria andNursingReportidIsNotNull() {
            addCriterion("\"nursing reportid\" is not null");
            return (Criteria) this;
        }

        public Criteria andNursingReportidEqualTo(String value) {
            addCriterion("\"nursing reportid\" =", value, "nursingReportid");
            return (Criteria) this;
        }

        public Criteria andNursingReportidNotEqualTo(String value) {
            addCriterion("\"nursing reportid\" <>", value, "nursingReportid");
            return (Criteria) this;
        }

        public Criteria andNursingReportidGreaterThan(String value) {
            addCriterion("\"nursing reportid\" >", value, "nursingReportid");
            return (Criteria) this;
        }

        public Criteria andNursingReportidGreaterThanOrEqualTo(String value) {
            addCriterion("\"nursing reportid\" >=", value, "nursingReportid");
            return (Criteria) this;
        }

        public Criteria andNursingReportidLessThan(String value) {
            addCriterion("\"nursing reportid\" <", value, "nursingReportid");
            return (Criteria) this;
        }

        public Criteria andNursingReportidLessThanOrEqualTo(String value) {
            addCriterion("\"nursing reportid\" <=", value, "nursingReportid");
            return (Criteria) this;
        }

        public Criteria andNursingReportidLike(String value) {
            addCriterion("\"nursing reportid\" like", value, "nursingReportid");
            return (Criteria) this;
        }

        public Criteria andNursingReportidNotLike(String value) {
            addCriterion("\"nursing reportid\" not like", value, "nursingReportid");
            return (Criteria) this;
        }

        public Criteria andNursingReportidIn(List<String> values) {
            addCriterion("\"nursing reportid\" in", values, "nursingReportid");
            return (Criteria) this;
        }

        public Criteria andNursingReportidNotIn(List<String> values) {
            addCriterion("\"nursing reportid\" not in", values, "nursingReportid");
            return (Criteria) this;
        }

        public Criteria andNursingReportidBetween(String value1, String value2) {
            addCriterion("\"nursing reportid\" between", value1, value2, "nursingReportid");
            return (Criteria) this;
        }

        public Criteria andNursingReportidNotBetween(String value1, String value2) {
            addCriterion("\"nursing reportid\" not between", value1, value2, "nursingReportid");
            return (Criteria) this;
        }

        public Criteria andNursingReportOrderidIsNull() {
            addCriterion("nursing_report_orderid is null");
            return (Criteria) this;
        }

        public Criteria andNursingReportOrderidIsNotNull() {
            addCriterion("nursing_report_orderid is not null");
            return (Criteria) this;
        }

        public Criteria andNursingReportOrderidEqualTo(String value) {
            addCriterion("nursing_report_orderid =", value, "nursingReportOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingReportOrderidNotEqualTo(String value) {
            addCriterion("nursing_report_orderid <>", value, "nursingReportOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingReportOrderidGreaterThan(String value) {
            addCriterion("nursing_report_orderid >", value, "nursingReportOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingReportOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_report_orderid >=", value, "nursingReportOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingReportOrderidLessThan(String value) {
            addCriterion("nursing_report_orderid <", value, "nursingReportOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingReportOrderidLessThanOrEqualTo(String value) {
            addCriterion("nursing_report_orderid <=", value, "nursingReportOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingReportOrderidLike(String value) {
            addCriterion("nursing_report_orderid like", value, "nursingReportOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingReportOrderidNotLike(String value) {
            addCriterion("nursing_report_orderid not like", value, "nursingReportOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingReportOrderidIn(List<String> values) {
            addCriterion("nursing_report_orderid in", values, "nursingReportOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingReportOrderidNotIn(List<String> values) {
            addCriterion("nursing_report_orderid not in", values, "nursingReportOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingReportOrderidBetween(String value1, String value2) {
            addCriterion("nursing_report_orderid between", value1, value2, "nursingReportOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingReportOrderidNotBetween(String value1, String value2) {
            addCriterion("nursing_report_orderid not between", value1, value2, "nursingReportOrderid");
            return (Criteria) this;
        }

        public Criteria andNursingReportNurseidIsNull() {
            addCriterion("nursing_report_nurseid is null");
            return (Criteria) this;
        }

        public Criteria andNursingReportNurseidIsNotNull() {
            addCriterion("nursing_report_nurseid is not null");
            return (Criteria) this;
        }

        public Criteria andNursingReportNurseidEqualTo(String value) {
            addCriterion("nursing_report_nurseid =", value, "nursingReportNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingReportNurseidNotEqualTo(String value) {
            addCriterion("nursing_report_nurseid <>", value, "nursingReportNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingReportNurseidGreaterThan(String value) {
            addCriterion("nursing_report_nurseid >", value, "nursingReportNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingReportNurseidGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_report_nurseid >=", value, "nursingReportNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingReportNurseidLessThan(String value) {
            addCriterion("nursing_report_nurseid <", value, "nursingReportNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingReportNurseidLessThanOrEqualTo(String value) {
            addCriterion("nursing_report_nurseid <=", value, "nursingReportNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingReportNurseidLike(String value) {
            addCriterion("nursing_report_nurseid like", value, "nursingReportNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingReportNurseidNotLike(String value) {
            addCriterion("nursing_report_nurseid not like", value, "nursingReportNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingReportNurseidIn(List<String> values) {
            addCriterion("nursing_report_nurseid in", values, "nursingReportNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingReportNurseidNotIn(List<String> values) {
            addCriterion("nursing_report_nurseid not in", values, "nursingReportNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingReportNurseidBetween(String value1, String value2) {
            addCriterion("nursing_report_nurseid between", value1, value2, "nursingReportNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingReportNurseidNotBetween(String value1, String value2) {
            addCriterion("nursing_report_nurseid not between", value1, value2, "nursingReportNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingReportContentidIsNull() {
            addCriterion("nursing_report_contentid is null");
            return (Criteria) this;
        }

        public Criteria andNursingReportContentidIsNotNull() {
            addCriterion("nursing_report_contentid is not null");
            return (Criteria) this;
        }

        public Criteria andNursingReportContentidEqualTo(String value) {
            addCriterion("nursing_report_contentid =", value, "nursingReportContentid");
            return (Criteria) this;
        }

        public Criteria andNursingReportContentidNotEqualTo(String value) {
            addCriterion("nursing_report_contentid <>", value, "nursingReportContentid");
            return (Criteria) this;
        }

        public Criteria andNursingReportContentidGreaterThan(String value) {
            addCriterion("nursing_report_contentid >", value, "nursingReportContentid");
            return (Criteria) this;
        }

        public Criteria andNursingReportContentidGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_report_contentid >=", value, "nursingReportContentid");
            return (Criteria) this;
        }

        public Criteria andNursingReportContentidLessThan(String value) {
            addCriterion("nursing_report_contentid <", value, "nursingReportContentid");
            return (Criteria) this;
        }

        public Criteria andNursingReportContentidLessThanOrEqualTo(String value) {
            addCriterion("nursing_report_contentid <=", value, "nursingReportContentid");
            return (Criteria) this;
        }

        public Criteria andNursingReportContentidLike(String value) {
            addCriterion("nursing_report_contentid like", value, "nursingReportContentid");
            return (Criteria) this;
        }

        public Criteria andNursingReportContentidNotLike(String value) {
            addCriterion("nursing_report_contentid not like", value, "nursingReportContentid");
            return (Criteria) this;
        }

        public Criteria andNursingReportContentidIn(List<String> values) {
            addCriterion("nursing_report_contentid in", values, "nursingReportContentid");
            return (Criteria) this;
        }

        public Criteria andNursingReportContentidNotIn(List<String> values) {
            addCriterion("nursing_report_contentid not in", values, "nursingReportContentid");
            return (Criteria) this;
        }

        public Criteria andNursingReportContentidBetween(String value1, String value2) {
            addCriterion("nursing_report_contentid between", value1, value2, "nursingReportContentid");
            return (Criteria) this;
        }

        public Criteria andNursingReportContentidNotBetween(String value1, String value2) {
            addCriterion("nursing_report_contentid not between", value1, value2, "nursingReportContentid");
            return (Criteria) this;
        }

        public Criteria andNursingReportNoteIsNull() {
            addCriterion("nursing_report_note is null");
            return (Criteria) this;
        }

        public Criteria andNursingReportNoteIsNotNull() {
            addCriterion("nursing_report_note is not null");
            return (Criteria) this;
        }

        public Criteria andNursingReportNoteEqualTo(String value) {
            addCriterion("nursing_report_note =", value, "nursingReportNote");
            return (Criteria) this;
        }

        public Criteria andNursingReportNoteNotEqualTo(String value) {
            addCriterion("nursing_report_note <>", value, "nursingReportNote");
            return (Criteria) this;
        }

        public Criteria andNursingReportNoteGreaterThan(String value) {
            addCriterion("nursing_report_note >", value, "nursingReportNote");
            return (Criteria) this;
        }

        public Criteria andNursingReportNoteGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_report_note >=", value, "nursingReportNote");
            return (Criteria) this;
        }

        public Criteria andNursingReportNoteLessThan(String value) {
            addCriterion("nursing_report_note <", value, "nursingReportNote");
            return (Criteria) this;
        }

        public Criteria andNursingReportNoteLessThanOrEqualTo(String value) {
            addCriterion("nursing_report_note <=", value, "nursingReportNote");
            return (Criteria) this;
        }

        public Criteria andNursingReportNoteLike(String value) {
            addCriterion("nursing_report_note like", value, "nursingReportNote");
            return (Criteria) this;
        }

        public Criteria andNursingReportNoteNotLike(String value) {
            addCriterion("nursing_report_note not like", value, "nursingReportNote");
            return (Criteria) this;
        }

        public Criteria andNursingReportNoteIn(List<String> values) {
            addCriterion("nursing_report_note in", values, "nursingReportNote");
            return (Criteria) this;
        }

        public Criteria andNursingReportNoteNotIn(List<String> values) {
            addCriterion("nursing_report_note not in", values, "nursingReportNote");
            return (Criteria) this;
        }

        public Criteria andNursingReportNoteBetween(String value1, String value2) {
            addCriterion("nursing_report_note between", value1, value2, "nursingReportNote");
            return (Criteria) this;
        }

        public Criteria andNursingReportNoteNotBetween(String value1, String value2) {
            addCriterion("nursing_report_note not between", value1, value2, "nursingReportNote");
            return (Criteria) this;
        }

        public Criteria andNursingReportServicepicIsNull() {
            addCriterion("nursing_report_servicepic is null");
            return (Criteria) this;
        }

        public Criteria andNursingReportServicepicIsNotNull() {
            addCriterion("nursing_report_servicepic is not null");
            return (Criteria) this;
        }

        public Criteria andNursingReportServicepicEqualTo(String value) {
            addCriterion("nursing_report_servicepic =", value, "nursingReportServicepic");
            return (Criteria) this;
        }

        public Criteria andNursingReportServicepicNotEqualTo(String value) {
            addCriterion("nursing_report_servicepic <>", value, "nursingReportServicepic");
            return (Criteria) this;
        }

        public Criteria andNursingReportServicepicGreaterThan(String value) {
            addCriterion("nursing_report_servicepic >", value, "nursingReportServicepic");
            return (Criteria) this;
        }

        public Criteria andNursingReportServicepicGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_report_servicepic >=", value, "nursingReportServicepic");
            return (Criteria) this;
        }

        public Criteria andNursingReportServicepicLessThan(String value) {
            addCriterion("nursing_report_servicepic <", value, "nursingReportServicepic");
            return (Criteria) this;
        }

        public Criteria andNursingReportServicepicLessThanOrEqualTo(String value) {
            addCriterion("nursing_report_servicepic <=", value, "nursingReportServicepic");
            return (Criteria) this;
        }

        public Criteria andNursingReportServicepicLike(String value) {
            addCriterion("nursing_report_servicepic like", value, "nursingReportServicepic");
            return (Criteria) this;
        }

        public Criteria andNursingReportServicepicNotLike(String value) {
            addCriterion("nursing_report_servicepic not like", value, "nursingReportServicepic");
            return (Criteria) this;
        }

        public Criteria andNursingReportServicepicIn(List<String> values) {
            addCriterion("nursing_report_servicepic in", values, "nursingReportServicepic");
            return (Criteria) this;
        }

        public Criteria andNursingReportServicepicNotIn(List<String> values) {
            addCriterion("nursing_report_servicepic not in", values, "nursingReportServicepic");
            return (Criteria) this;
        }

        public Criteria andNursingReportServicepicBetween(String value1, String value2) {
            addCriterion("nursing_report_servicepic between", value1, value2, "nursingReportServicepic");
            return (Criteria) this;
        }

        public Criteria andNursingReportServicepicNotBetween(String value1, String value2) {
            addCriterion("nursing_report_servicepic not between", value1, value2, "nursingReportServicepic");
            return (Criteria) this;
        }

        public Criteria andNursingReportAddrecordsIsNull() {
            addCriterion("nursing_report_addrecords is null");
            return (Criteria) this;
        }

        public Criteria andNursingReportAddrecordsIsNotNull() {
            addCriterion("nursing_report_addrecords is not null");
            return (Criteria) this;
        }

        public Criteria andNursingReportAddrecordsEqualTo(String value) {
            addCriterion("nursing_report_addrecords =", value, "nursingReportAddrecords");
            return (Criteria) this;
        }

        public Criteria andNursingReportAddrecordsNotEqualTo(String value) {
            addCriterion("nursing_report_addrecords <>", value, "nursingReportAddrecords");
            return (Criteria) this;
        }

        public Criteria andNursingReportAddrecordsGreaterThan(String value) {
            addCriterion("nursing_report_addrecords >", value, "nursingReportAddrecords");
            return (Criteria) this;
        }

        public Criteria andNursingReportAddrecordsGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_report_addrecords >=", value, "nursingReportAddrecords");
            return (Criteria) this;
        }

        public Criteria andNursingReportAddrecordsLessThan(String value) {
            addCriterion("nursing_report_addrecords <", value, "nursingReportAddrecords");
            return (Criteria) this;
        }

        public Criteria andNursingReportAddrecordsLessThanOrEqualTo(String value) {
            addCriterion("nursing_report_addrecords <=", value, "nursingReportAddrecords");
            return (Criteria) this;
        }

        public Criteria andNursingReportAddrecordsLike(String value) {
            addCriterion("nursing_report_addrecords like", value, "nursingReportAddrecords");
            return (Criteria) this;
        }

        public Criteria andNursingReportAddrecordsNotLike(String value) {
            addCriterion("nursing_report_addrecords not like", value, "nursingReportAddrecords");
            return (Criteria) this;
        }

        public Criteria andNursingReportAddrecordsIn(List<String> values) {
            addCriterion("nursing_report_addrecords in", values, "nursingReportAddrecords");
            return (Criteria) this;
        }

        public Criteria andNursingReportAddrecordsNotIn(List<String> values) {
            addCriterion("nursing_report_addrecords not in", values, "nursingReportAddrecords");
            return (Criteria) this;
        }

        public Criteria andNursingReportAddrecordsBetween(String value1, String value2) {
            addCriterion("nursing_report_addrecords between", value1, value2, "nursingReportAddrecords");
            return (Criteria) this;
        }

        public Criteria andNursingReportAddrecordsNotBetween(String value1, String value2) {
            addCriterion("nursing_report_addrecords not between", value1, value2, "nursingReportAddrecords");
            return (Criteria) this;
        }

        public Criteria andNursingReportLableIsNull() {
            addCriterion("nursing_report_lable is null");
            return (Criteria) this;
        }

        public Criteria andNursingReportLableIsNotNull() {
            addCriterion("nursing_report_lable is not null");
            return (Criteria) this;
        }

        public Criteria andNursingReportLableEqualTo(String value) {
            addCriterion("nursing_report_lable =", value, "nursingReportLable");
            return (Criteria) this;
        }

        public Criteria andNursingReportLableNotEqualTo(String value) {
            addCriterion("nursing_report_lable <>", value, "nursingReportLable");
            return (Criteria) this;
        }

        public Criteria andNursingReportLableGreaterThan(String value) {
            addCriterion("nursing_report_lable >", value, "nursingReportLable");
            return (Criteria) this;
        }

        public Criteria andNursingReportLableGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_report_lable >=", value, "nursingReportLable");
            return (Criteria) this;
        }

        public Criteria andNursingReportLableLessThan(String value) {
            addCriterion("nursing_report_lable <", value, "nursingReportLable");
            return (Criteria) this;
        }

        public Criteria andNursingReportLableLessThanOrEqualTo(String value) {
            addCriterion("nursing_report_lable <=", value, "nursingReportLable");
            return (Criteria) this;
        }

        public Criteria andNursingReportLableLike(String value) {
            addCriterion("nursing_report_lable like", value, "nursingReportLable");
            return (Criteria) this;
        }

        public Criteria andNursingReportLableNotLike(String value) {
            addCriterion("nursing_report_lable not like", value, "nursingReportLable");
            return (Criteria) this;
        }

        public Criteria andNursingReportLableIn(List<String> values) {
            addCriterion("nursing_report_lable in", values, "nursingReportLable");
            return (Criteria) this;
        }

        public Criteria andNursingReportLableNotIn(List<String> values) {
            addCriterion("nursing_report_lable not in", values, "nursingReportLable");
            return (Criteria) this;
        }

        public Criteria andNursingReportLableBetween(String value1, String value2) {
            addCriterion("nursing_report_lable between", value1, value2, "nursingReportLable");
            return (Criteria) this;
        }

        public Criteria andNursingReportLableNotBetween(String value1, String value2) {
            addCriterion("nursing_report_lable not between", value1, value2, "nursingReportLable");
            return (Criteria) this;
        }

        public Criteria andNursingReportpicIsNull() {
            addCriterion("nursing_reportpic is null");
            return (Criteria) this;
        }

        public Criteria andNursingReportpicIsNotNull() {
            addCriterion("nursing_reportpic is not null");
            return (Criteria) this;
        }

        public Criteria andNursingReportpicEqualTo(String value) {
            addCriterion("nursing_reportpic =", value, "nursingReportpic");
            return (Criteria) this;
        }

        public Criteria andNursingReportpicNotEqualTo(String value) {
            addCriterion("nursing_reportpic <>", value, "nursingReportpic");
            return (Criteria) this;
        }

        public Criteria andNursingReportpicGreaterThan(String value) {
            addCriterion("nursing_reportpic >", value, "nursingReportpic");
            return (Criteria) this;
        }

        public Criteria andNursingReportpicGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_reportpic >=", value, "nursingReportpic");
            return (Criteria) this;
        }

        public Criteria andNursingReportpicLessThan(String value) {
            addCriterion("nursing_reportpic <", value, "nursingReportpic");
            return (Criteria) this;
        }

        public Criteria andNursingReportpicLessThanOrEqualTo(String value) {
            addCriterion("nursing_reportpic <=", value, "nursingReportpic");
            return (Criteria) this;
        }

        public Criteria andNursingReportpicLike(String value) {
            addCriterion("nursing_reportpic like", value, "nursingReportpic");
            return (Criteria) this;
        }

        public Criteria andNursingReportpicNotLike(String value) {
            addCriterion("nursing_reportpic not like", value, "nursingReportpic");
            return (Criteria) this;
        }

        public Criteria andNursingReportpicIn(List<String> values) {
            addCriterion("nursing_reportpic in", values, "nursingReportpic");
            return (Criteria) this;
        }

        public Criteria andNursingReportpicNotIn(List<String> values) {
            addCriterion("nursing_reportpic not in", values, "nursingReportpic");
            return (Criteria) this;
        }

        public Criteria andNursingReportpicBetween(String value1, String value2) {
            addCriterion("nursing_reportpic between", value1, value2, "nursingReportpic");
            return (Criteria) this;
        }

        public Criteria andNursingReportpicNotBetween(String value1, String value2) {
            addCriterion("nursing_reportpic not between", value1, value2, "nursingReportpic");
            return (Criteria) this;
        }

        public Criteria andNursingReportCreatetimeIsNull() {
            addCriterion("nursing_report_createtime is null");
            return (Criteria) this;
        }

        public Criteria andNursingReportCreatetimeIsNotNull() {
            addCriterion("nursing_report_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andNursingReportCreatetimeEqualTo(Date value) {
            addCriterion("nursing_report_createtime =", value, "nursingReportCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingReportCreatetimeNotEqualTo(Date value) {
            addCriterion("nursing_report_createtime <>", value, "nursingReportCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingReportCreatetimeGreaterThan(Date value) {
            addCriterion("nursing_report_createtime >", value, "nursingReportCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingReportCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nursing_report_createtime >=", value, "nursingReportCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingReportCreatetimeLessThan(Date value) {
            addCriterion("nursing_report_createtime <", value, "nursingReportCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingReportCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("nursing_report_createtime <=", value, "nursingReportCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingReportCreatetimeIn(List<Date> values) {
            addCriterion("nursing_report_createtime in", values, "nursingReportCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingReportCreatetimeNotIn(List<Date> values) {
            addCriterion("nursing_report_createtime not in", values, "nursingReportCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingReportCreatetimeBetween(Date value1, Date value2) {
            addCriterion("nursing_report_createtime between", value1, value2, "nursingReportCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingReportCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("nursing_report_createtime not between", value1, value2, "nursingReportCreatetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}