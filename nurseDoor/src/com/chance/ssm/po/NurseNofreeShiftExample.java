package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NurseNofreeShiftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NurseNofreeShiftExample() {
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

        public Criteria andNurseNofreeShiftIdIsNull() {
            addCriterion("nurse_nofree_shift_id is null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftIdIsNotNull() {
            addCriterion("nurse_nofree_shift_id is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftIdEqualTo(String value) {
            addCriterion("nurse_nofree_shift_id =", value, "nurseNofreeShiftId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftIdNotEqualTo(String value) {
            addCriterion("nurse_nofree_shift_id <>", value, "nurseNofreeShiftId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftIdGreaterThan(String value) {
            addCriterion("nurse_nofree_shift_id >", value, "nurseNofreeShiftId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftIdGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_shift_id >=", value, "nurseNofreeShiftId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftIdLessThan(String value) {
            addCriterion("nurse_nofree_shift_id <", value, "nurseNofreeShiftId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftIdLessThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_shift_id <=", value, "nurseNofreeShiftId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftIdLike(String value) {
            addCriterion("nurse_nofree_shift_id like", value, "nurseNofreeShiftId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftIdNotLike(String value) {
            addCriterion("nurse_nofree_shift_id not like", value, "nurseNofreeShiftId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftIdIn(List<String> values) {
            addCriterion("nurse_nofree_shift_id in", values, "nurseNofreeShiftId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftIdNotIn(List<String> values) {
            addCriterion("nurse_nofree_shift_id not in", values, "nurseNofreeShiftId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftIdBetween(String value1, String value2) {
            addCriterion("nurse_nofree_shift_id between", value1, value2, "nurseNofreeShiftId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftIdNotBetween(String value1, String value2) {
            addCriterion("nurse_nofree_shift_id not between", value1, value2, "nurseNofreeShiftId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNurseIdIsNull() {
            addCriterion("nurse_nofree_shift_nurse_id is null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNurseIdIsNotNull() {
            addCriterion("nurse_nofree_shift_nurse_id is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNurseIdEqualTo(String value) {
            addCriterion("nurse_nofree_shift_nurse_id =", value, "nurseNofreeShiftNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNurseIdNotEqualTo(String value) {
            addCriterion("nurse_nofree_shift_nurse_id <>", value, "nurseNofreeShiftNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNurseIdGreaterThan(String value) {
            addCriterion("nurse_nofree_shift_nurse_id >", value, "nurseNofreeShiftNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNurseIdGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_shift_nurse_id >=", value, "nurseNofreeShiftNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNurseIdLessThan(String value) {
            addCriterion("nurse_nofree_shift_nurse_id <", value, "nurseNofreeShiftNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNurseIdLessThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_shift_nurse_id <=", value, "nurseNofreeShiftNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNurseIdLike(String value) {
            addCriterion("nurse_nofree_shift_nurse_id like", value, "nurseNofreeShiftNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNurseIdNotLike(String value) {
            addCriterion("nurse_nofree_shift_nurse_id not like", value, "nurseNofreeShiftNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNurseIdIn(List<String> values) {
            addCriterion("nurse_nofree_shift_nurse_id in", values, "nurseNofreeShiftNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNurseIdNotIn(List<String> values) {
            addCriterion("nurse_nofree_shift_nurse_id not in", values, "nurseNofreeShiftNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNurseIdBetween(String value1, String value2) {
            addCriterion("nurse_nofree_shift_nurse_id between", value1, value2, "nurseNofreeShiftNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNurseIdNotBetween(String value1, String value2) {
            addCriterion("nurse_nofree_shift_nurse_id not between", value1, value2, "nurseNofreeShiftNurseId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNameIsNull() {
            addCriterion("nurse_nofree_shift_name is null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNameIsNotNull() {
            addCriterion("nurse_nofree_shift_name is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNameEqualTo(String value) {
            addCriterion("nurse_nofree_shift_name =", value, "nurseNofreeShiftName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNameNotEqualTo(String value) {
            addCriterion("nurse_nofree_shift_name <>", value, "nurseNofreeShiftName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNameGreaterThan(String value) {
            addCriterion("nurse_nofree_shift_name >", value, "nurseNofreeShiftName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNameGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_shift_name >=", value, "nurseNofreeShiftName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNameLessThan(String value) {
            addCriterion("nurse_nofree_shift_name <", value, "nurseNofreeShiftName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNameLessThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_shift_name <=", value, "nurseNofreeShiftName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNameLike(String value) {
            addCriterion("nurse_nofree_shift_name like", value, "nurseNofreeShiftName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNameNotLike(String value) {
            addCriterion("nurse_nofree_shift_name not like", value, "nurseNofreeShiftName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNameIn(List<String> values) {
            addCriterion("nurse_nofree_shift_name in", values, "nurseNofreeShiftName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNameNotIn(List<String> values) {
            addCriterion("nurse_nofree_shift_name not in", values, "nurseNofreeShiftName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNameBetween(String value1, String value2) {
            addCriterion("nurse_nofree_shift_name between", value1, value2, "nurseNofreeShiftName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNameNotBetween(String value1, String value2) {
            addCriterion("nurse_nofree_shift_name not between", value1, value2, "nurseNofreeShiftName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNoteIsNull() {
            addCriterion("nurse_nofree_shift_note is null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNoteIsNotNull() {
            addCriterion("nurse_nofree_shift_note is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNoteEqualTo(String value) {
            addCriterion("nurse_nofree_shift_note =", value, "nurseNofreeShiftNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNoteNotEqualTo(String value) {
            addCriterion("nurse_nofree_shift_note <>", value, "nurseNofreeShiftNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNoteGreaterThan(String value) {
            addCriterion("nurse_nofree_shift_note >", value, "nurseNofreeShiftNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNoteGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_shift_note >=", value, "nurseNofreeShiftNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNoteLessThan(String value) {
            addCriterion("nurse_nofree_shift_note <", value, "nurseNofreeShiftNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNoteLessThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_shift_note <=", value, "nurseNofreeShiftNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNoteLike(String value) {
            addCriterion("nurse_nofree_shift_note like", value, "nurseNofreeShiftNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNoteNotLike(String value) {
            addCriterion("nurse_nofree_shift_note not like", value, "nurseNofreeShiftNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNoteIn(List<String> values) {
            addCriterion("nurse_nofree_shift_note in", values, "nurseNofreeShiftNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNoteNotIn(List<String> values) {
            addCriterion("nurse_nofree_shift_note not in", values, "nurseNofreeShiftNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNoteBetween(String value1, String value2) {
            addCriterion("nurse_nofree_shift_note between", value1, value2, "nurseNofreeShiftNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftNoteNotBetween(String value1, String value2) {
            addCriterion("nurse_nofree_shift_note not between", value1, value2, "nurseNofreeShiftNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftColorIsNull() {
            addCriterion("nurse_nofree_shift_color is null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftColorIsNotNull() {
            addCriterion("nurse_nofree_shift_color is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftColorEqualTo(String value) {
            addCriterion("nurse_nofree_shift_color =", value, "nurseNofreeShiftColor");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftColorNotEqualTo(String value) {
            addCriterion("nurse_nofree_shift_color <>", value, "nurseNofreeShiftColor");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftColorGreaterThan(String value) {
            addCriterion("nurse_nofree_shift_color >", value, "nurseNofreeShiftColor");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftColorGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_shift_color >=", value, "nurseNofreeShiftColor");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftColorLessThan(String value) {
            addCriterion("nurse_nofree_shift_color <", value, "nurseNofreeShiftColor");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftColorLessThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_shift_color <=", value, "nurseNofreeShiftColor");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftColorLike(String value) {
            addCriterion("nurse_nofree_shift_color like", value, "nurseNofreeShiftColor");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftColorNotLike(String value) {
            addCriterion("nurse_nofree_shift_color not like", value, "nurseNofreeShiftColor");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftColorIn(List<String> values) {
            addCriterion("nurse_nofree_shift_color in", values, "nurseNofreeShiftColor");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftColorNotIn(List<String> values) {
            addCriterion("nurse_nofree_shift_color not in", values, "nurseNofreeShiftColor");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftColorBetween(String value1, String value2) {
            addCriterion("nurse_nofree_shift_color between", value1, value2, "nurseNofreeShiftColor");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftColorNotBetween(String value1, String value2) {
            addCriterion("nurse_nofree_shift_color not between", value1, value2, "nurseNofreeShiftColor");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftBegintimeIsNull() {
            addCriterion("nurse_nofree_shift_begintime is null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftBegintimeIsNotNull() {
            addCriterion("nurse_nofree_shift_begintime is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftBegintimeEqualTo(String value) {
            addCriterion("nurse_nofree_shift_begintime =", value, "nurseNofreeShiftBegintime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftBegintimeNotEqualTo(String value) {
            addCriterion("nurse_nofree_shift_begintime <>", value, "nurseNofreeShiftBegintime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftBegintimeGreaterThan(String value) {
            addCriterion("nurse_nofree_shift_begintime >", value, "nurseNofreeShiftBegintime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftBegintimeGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_shift_begintime >=", value, "nurseNofreeShiftBegintime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftBegintimeLessThan(String value) {
            addCriterion("nurse_nofree_shift_begintime <", value, "nurseNofreeShiftBegintime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftBegintimeLessThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_shift_begintime <=", value, "nurseNofreeShiftBegintime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftBegintimeLike(String value) {
            addCriterion("nurse_nofree_shift_begintime like", value, "nurseNofreeShiftBegintime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftBegintimeNotLike(String value) {
            addCriterion("nurse_nofree_shift_begintime not like", value, "nurseNofreeShiftBegintime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftBegintimeIn(List<String> values) {
            addCriterion("nurse_nofree_shift_begintime in", values, "nurseNofreeShiftBegintime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftBegintimeNotIn(List<String> values) {
            addCriterion("nurse_nofree_shift_begintime not in", values, "nurseNofreeShiftBegintime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftBegintimeBetween(String value1, String value2) {
            addCriterion("nurse_nofree_shift_begintime between", value1, value2, "nurseNofreeShiftBegintime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftBegintimeNotBetween(String value1, String value2) {
            addCriterion("nurse_nofree_shift_begintime not between", value1, value2, "nurseNofreeShiftBegintime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStoptimeIsNull() {
            addCriterion("nurse_nofree_shift_stoptime is null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStoptimeIsNotNull() {
            addCriterion("nurse_nofree_shift_stoptime is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStoptimeEqualTo(String value) {
            addCriterion("nurse_nofree_shift_stoptime =", value, "nurseNofreeShiftStoptime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStoptimeNotEqualTo(String value) {
            addCriterion("nurse_nofree_shift_stoptime <>", value, "nurseNofreeShiftStoptime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStoptimeGreaterThan(String value) {
            addCriterion("nurse_nofree_shift_stoptime >", value, "nurseNofreeShiftStoptime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStoptimeGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_shift_stoptime >=", value, "nurseNofreeShiftStoptime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStoptimeLessThan(String value) {
            addCriterion("nurse_nofree_shift_stoptime <", value, "nurseNofreeShiftStoptime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStoptimeLessThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_shift_stoptime <=", value, "nurseNofreeShiftStoptime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStoptimeLike(String value) {
            addCriterion("nurse_nofree_shift_stoptime like", value, "nurseNofreeShiftStoptime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStoptimeNotLike(String value) {
            addCriterion("nurse_nofree_shift_stoptime not like", value, "nurseNofreeShiftStoptime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStoptimeIn(List<String> values) {
            addCriterion("nurse_nofree_shift_stoptime in", values, "nurseNofreeShiftStoptime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStoptimeNotIn(List<String> values) {
            addCriterion("nurse_nofree_shift_stoptime not in", values, "nurseNofreeShiftStoptime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStoptimeBetween(String value1, String value2) {
            addCriterion("nurse_nofree_shift_stoptime between", value1, value2, "nurseNofreeShiftStoptime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStoptimeNotBetween(String value1, String value2) {
            addCriterion("nurse_nofree_shift_stoptime not between", value1, value2, "nurseNofreeShiftStoptime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStateIsNull() {
            addCriterion("nurse_nofree_shift_state is null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStateIsNotNull() {
            addCriterion("nurse_nofree_shift_state is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStateEqualTo(Integer value) {
            addCriterion("nurse_nofree_shift_state =", value, "nurseNofreeShiftState");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStateNotEqualTo(Integer value) {
            addCriterion("nurse_nofree_shift_state <>", value, "nurseNofreeShiftState");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStateGreaterThan(Integer value) {
            addCriterion("nurse_nofree_shift_state >", value, "nurseNofreeShiftState");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("nurse_nofree_shift_state >=", value, "nurseNofreeShiftState");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStateLessThan(Integer value) {
            addCriterion("nurse_nofree_shift_state <", value, "nurseNofreeShiftState");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStateLessThanOrEqualTo(Integer value) {
            addCriterion("nurse_nofree_shift_state <=", value, "nurseNofreeShiftState");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStateIn(List<Integer> values) {
            addCriterion("nurse_nofree_shift_state in", values, "nurseNofreeShiftState");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStateNotIn(List<Integer> values) {
            addCriterion("nurse_nofree_shift_state not in", values, "nurseNofreeShiftState");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStateBetween(Integer value1, Integer value2) {
            addCriterion("nurse_nofree_shift_state between", value1, value2, "nurseNofreeShiftState");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftStateNotBetween(Integer value1, Integer value2) {
            addCriterion("nurse_nofree_shift_state not between", value1, value2, "nurseNofreeShiftState");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftCreatetimeIsNull() {
            addCriterion("nurse_nofree_shift_createtime is null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftCreatetimeIsNotNull() {
            addCriterion("nurse_nofree_shift_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftCreatetimeEqualTo(Date value) {
            addCriterion("nurse_nofree_shift_createtime =", value, "nurseNofreeShiftCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftCreatetimeNotEqualTo(Date value) {
            addCriterion("nurse_nofree_shift_createtime <>", value, "nurseNofreeShiftCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftCreatetimeGreaterThan(Date value) {
            addCriterion("nurse_nofree_shift_createtime >", value, "nurseNofreeShiftCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nurse_nofree_shift_createtime >=", value, "nurseNofreeShiftCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftCreatetimeLessThan(Date value) {
            addCriterion("nurse_nofree_shift_createtime <", value, "nurseNofreeShiftCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("nurse_nofree_shift_createtime <=", value, "nurseNofreeShiftCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftCreatetimeIn(List<Date> values) {
            addCriterion("nurse_nofree_shift_createtime in", values, "nurseNofreeShiftCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftCreatetimeNotIn(List<Date> values) {
            addCriterion("nurse_nofree_shift_createtime not in", values, "nurseNofreeShiftCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftCreatetimeBetween(Date value1, Date value2) {
            addCriterion("nurse_nofree_shift_createtime between", value1, value2, "nurseNofreeShiftCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeShiftCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("nurse_nofree_shift_createtime not between", value1, value2, "nurseNofreeShiftCreatetime");
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