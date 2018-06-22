package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NurseNofreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NurseNofreeExample() {
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

        public Criteria andNurseNofreeIdIsNull() {
            addCriterion("nurse_nofree_id is null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeIdIsNotNull() {
            addCriterion("nurse_nofree_id is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeIdEqualTo(String value) {
            addCriterion("nurse_nofree_id =", value, "nurseNofreeId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeIdNotEqualTo(String value) {
            addCriterion("nurse_nofree_id <>", value, "nurseNofreeId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeIdGreaterThan(String value) {
            addCriterion("nurse_nofree_id >", value, "nurseNofreeId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeIdGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_id >=", value, "nurseNofreeId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeIdLessThan(String value) {
            addCriterion("nurse_nofree_id <", value, "nurseNofreeId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeIdLessThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_id <=", value, "nurseNofreeId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeIdLike(String value) {
            addCriterion("nurse_nofree_id like", value, "nurseNofreeId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeIdNotLike(String value) {
            addCriterion("nurse_nofree_id not like", value, "nurseNofreeId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeIdIn(List<String> values) {
            addCriterion("nurse_nofree_id in", values, "nurseNofreeId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeIdNotIn(List<String> values) {
            addCriterion("nurse_nofree_id not in", values, "nurseNofreeId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeIdBetween(String value1, String value2) {
            addCriterion("nurse_nofree_id between", value1, value2, "nurseNofreeId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeIdNotBetween(String value1, String value2) {
            addCriterion("nurse_nofree_id not between", value1, value2, "nurseNofreeId");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNurseidIsNull() {
            addCriterion("nurse_nofree_nurseid is null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNurseidIsNotNull() {
            addCriterion("nurse_nofree_nurseid is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNurseidEqualTo(String value) {
            addCriterion("nurse_nofree_nurseid =", value, "nurseNofreeNurseid");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNurseidNotEqualTo(String value) {
            addCriterion("nurse_nofree_nurseid <>", value, "nurseNofreeNurseid");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNurseidGreaterThan(String value) {
            addCriterion("nurse_nofree_nurseid >", value, "nurseNofreeNurseid");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNurseidGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_nurseid >=", value, "nurseNofreeNurseid");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNurseidLessThan(String value) {
            addCriterion("nurse_nofree_nurseid <", value, "nurseNofreeNurseid");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNurseidLessThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_nurseid <=", value, "nurseNofreeNurseid");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNurseidLike(String value) {
            addCriterion("nurse_nofree_nurseid like", value, "nurseNofreeNurseid");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNurseidNotLike(String value) {
            addCriterion("nurse_nofree_nurseid not like", value, "nurseNofreeNurseid");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNurseidIn(List<String> values) {
            addCriterion("nurse_nofree_nurseid in", values, "nurseNofreeNurseid");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNurseidNotIn(List<String> values) {
            addCriterion("nurse_nofree_nurseid not in", values, "nurseNofreeNurseid");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNurseidBetween(String value1, String value2) {
            addCriterion("nurse_nofree_nurseid between", value1, value2, "nurseNofreeNurseid");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNurseidNotBetween(String value1, String value2) {
            addCriterion("nurse_nofree_nurseid not between", value1, value2, "nurseNofreeNurseid");
            return (Criteria) this;
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

        public Criteria andNurseNofreeNameIsNull() {
            addCriterion("nurse_nofree_name is null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNameIsNotNull() {
            addCriterion("nurse_nofree_name is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNameEqualTo(String value) {
            addCriterion("nurse_nofree_name =", value, "nurseNofreeName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNameNotEqualTo(String value) {
            addCriterion("nurse_nofree_name <>", value, "nurseNofreeName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNameGreaterThan(String value) {
            addCriterion("nurse_nofree_name >", value, "nurseNofreeName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNameGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_name >=", value, "nurseNofreeName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNameLessThan(String value) {
            addCriterion("nurse_nofree_name <", value, "nurseNofreeName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNameLessThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_name <=", value, "nurseNofreeName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNameLike(String value) {
            addCriterion("nurse_nofree_name like", value, "nurseNofreeName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNameNotLike(String value) {
            addCriterion("nurse_nofree_name not like", value, "nurseNofreeName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNameIn(List<String> values) {
            addCriterion("nurse_nofree_name in", values, "nurseNofreeName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNameNotIn(List<String> values) {
            addCriterion("nurse_nofree_name not in", values, "nurseNofreeName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNameBetween(String value1, String value2) {
            addCriterion("nurse_nofree_name between", value1, value2, "nurseNofreeName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNameNotBetween(String value1, String value2) {
            addCriterion("nurse_nofree_name not between", value1, value2, "nurseNofreeName");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNoteIsNull() {
            addCriterion("nurse_nofree_note is null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNoteIsNotNull() {
            addCriterion("nurse_nofree_note is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNoteEqualTo(String value) {
            addCriterion("nurse_nofree_note =", value, "nurseNofreeNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNoteNotEqualTo(String value) {
            addCriterion("nurse_nofree_note <>", value, "nurseNofreeNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNoteGreaterThan(String value) {
            addCriterion("nurse_nofree_note >", value, "nurseNofreeNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNoteGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_note >=", value, "nurseNofreeNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNoteLessThan(String value) {
            addCriterion("nurse_nofree_note <", value, "nurseNofreeNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNoteLessThanOrEqualTo(String value) {
            addCriterion("nurse_nofree_note <=", value, "nurseNofreeNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNoteLike(String value) {
            addCriterion("nurse_nofree_note like", value, "nurseNofreeNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNoteNotLike(String value) {
            addCriterion("nurse_nofree_note not like", value, "nurseNofreeNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNoteIn(List<String> values) {
            addCriterion("nurse_nofree_note in", values, "nurseNofreeNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNoteNotIn(List<String> values) {
            addCriterion("nurse_nofree_note not in", values, "nurseNofreeNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNoteBetween(String value1, String value2) {
            addCriterion("nurse_nofree_note between", value1, value2, "nurseNofreeNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeNoteNotBetween(String value1, String value2) {
            addCriterion("nurse_nofree_note not between", value1, value2, "nurseNofreeNote");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeDateIsNull() {
            addCriterion("nurse_nofree_date is null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeDateIsNotNull() {
            addCriterion("nurse_nofree_date is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeDateEqualTo(Date value) {
            addCriterion("nurse_nofree_date =", value, "nurseNofreeDate");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeDateNotEqualTo(Date value) {
            addCriterion("nurse_nofree_date <>", value, "nurseNofreeDate");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeDateGreaterThan(Date value) {
            addCriterion("nurse_nofree_date >", value, "nurseNofreeDate");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("nurse_nofree_date >=", value, "nurseNofreeDate");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeDateLessThan(Date value) {
            addCriterion("nurse_nofree_date <", value, "nurseNofreeDate");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeDateLessThanOrEqualTo(Date value) {
            addCriterion("nurse_nofree_date <=", value, "nurseNofreeDate");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeDateIn(List<Date> values) {
            addCriterion("nurse_nofree_date in", values, "nurseNofreeDate");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeDateNotIn(List<Date> values) {
            addCriterion("nurse_nofree_date not in", values, "nurseNofreeDate");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeDateBetween(Date value1, Date value2) {
            addCriterion("nurse_nofree_date between", value1, value2, "nurseNofreeDate");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeDateNotBetween(Date value1, Date value2) {
            addCriterion("nurse_nofree_date not between", value1, value2, "nurseNofreeDate");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeCreatetimeIsNull() {
            addCriterion("nurse_nofree_createtime is null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeCreatetimeIsNotNull() {
            addCriterion("nurse_nofree_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeCreatetimeEqualTo(Date value) {
            addCriterion("nurse_nofree_createtime =", value, "nurseNofreeCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeCreatetimeNotEqualTo(Date value) {
            addCriterion("nurse_nofree_createtime <>", value, "nurseNofreeCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeCreatetimeGreaterThan(Date value) {
            addCriterion("nurse_nofree_createtime >", value, "nurseNofreeCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nurse_nofree_createtime >=", value, "nurseNofreeCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeCreatetimeLessThan(Date value) {
            addCriterion("nurse_nofree_createtime <", value, "nurseNofreeCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("nurse_nofree_createtime <=", value, "nurseNofreeCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeCreatetimeIn(List<Date> values) {
            addCriterion("nurse_nofree_createtime in", values, "nurseNofreeCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeCreatetimeNotIn(List<Date> values) {
            addCriterion("nurse_nofree_createtime not in", values, "nurseNofreeCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeCreatetimeBetween(Date value1, Date value2) {
            addCriterion("nurse_nofree_createtime between", value1, value2, "nurseNofreeCreatetime");
            return (Criteria) this;
        }

        public Criteria andNurseNofreeCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("nurse_nofree_createtime not between", value1, value2, "nurseNofreeCreatetime");
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