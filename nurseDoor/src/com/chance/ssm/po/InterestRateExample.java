package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterestRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterestRateExample() {
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

        public Criteria andInterestRateIdIsNull() {
            addCriterion("interest_rate_id is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateIdIsNotNull() {
            addCriterion("interest_rate_id is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateIdEqualTo(String value) {
            addCriterion("interest_rate_id =", value, "interestRateId");
            return (Criteria) this;
        }

        public Criteria andInterestRateIdNotEqualTo(String value) {
            addCriterion("interest_rate_id <>", value, "interestRateId");
            return (Criteria) this;
        }

        public Criteria andInterestRateIdGreaterThan(String value) {
            addCriterion("interest_rate_id >", value, "interestRateId");
            return (Criteria) this;
        }

        public Criteria andInterestRateIdGreaterThanOrEqualTo(String value) {
            addCriterion("interest_rate_id >=", value, "interestRateId");
            return (Criteria) this;
        }

        public Criteria andInterestRateIdLessThan(String value) {
            addCriterion("interest_rate_id <", value, "interestRateId");
            return (Criteria) this;
        }

        public Criteria andInterestRateIdLessThanOrEqualTo(String value) {
            addCriterion("interest_rate_id <=", value, "interestRateId");
            return (Criteria) this;
        }

        public Criteria andInterestRateIdLike(String value) {
            addCriterion("interest_rate_id like", value, "interestRateId");
            return (Criteria) this;
        }

        public Criteria andInterestRateIdNotLike(String value) {
            addCriterion("interest_rate_id not like", value, "interestRateId");
            return (Criteria) this;
        }

        public Criteria andInterestRateIdIn(List<String> values) {
            addCriterion("interest_rate_id in", values, "interestRateId");
            return (Criteria) this;
        }

        public Criteria andInterestRateIdNotIn(List<String> values) {
            addCriterion("interest_rate_id not in", values, "interestRateId");
            return (Criteria) this;
        }

        public Criteria andInterestRateIdBetween(String value1, String value2) {
            addCriterion("interest_rate_id between", value1, value2, "interestRateId");
            return (Criteria) this;
        }

        public Criteria andInterestRateIdNotBetween(String value1, String value2) {
            addCriterion("interest_rate_id not between", value1, value2, "interestRateId");
            return (Criteria) this;
        }

        public Criteria andInterestRateSizeIsNull() {
            addCriterion("interest_rate_size is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateSizeIsNotNull() {
            addCriterion("interest_rate_size is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateSizeEqualTo(BigDecimal value) {
            addCriterion("interest_rate_size =", value, "interestRateSize");
            return (Criteria) this;
        }

        public Criteria andInterestRateSizeNotEqualTo(BigDecimal value) {
            addCriterion("interest_rate_size <>", value, "interestRateSize");
            return (Criteria) this;
        }

        public Criteria andInterestRateSizeGreaterThan(BigDecimal value) {
            addCriterion("interest_rate_size >", value, "interestRateSize");
            return (Criteria) this;
        }

        public Criteria andInterestRateSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_rate_size >=", value, "interestRateSize");
            return (Criteria) this;
        }

        public Criteria andInterestRateSizeLessThan(BigDecimal value) {
            addCriterion("interest_rate_size <", value, "interestRateSize");
            return (Criteria) this;
        }

        public Criteria andInterestRateSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_rate_size <=", value, "interestRateSize");
            return (Criteria) this;
        }

        public Criteria andInterestRateSizeIn(List<BigDecimal> values) {
            addCriterion("interest_rate_size in", values, "interestRateSize");
            return (Criteria) this;
        }

        public Criteria andInterestRateSizeNotIn(List<BigDecimal> values) {
            addCriterion("interest_rate_size not in", values, "interestRateSize");
            return (Criteria) this;
        }

        public Criteria andInterestRateSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_rate_size between", value1, value2, "interestRateSize");
            return (Criteria) this;
        }

        public Criteria andInterestRateSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_rate_size not between", value1, value2, "interestRateSize");
            return (Criteria) this;
        }

        public Criteria andInterestRateNoteIsNull() {
            addCriterion("interest_rate_note is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateNoteIsNotNull() {
            addCriterion("interest_rate_note is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateNoteEqualTo(String value) {
            addCriterion("interest_rate_note =", value, "interestRateNote");
            return (Criteria) this;
        }

        public Criteria andInterestRateNoteNotEqualTo(String value) {
            addCriterion("interest_rate_note <>", value, "interestRateNote");
            return (Criteria) this;
        }

        public Criteria andInterestRateNoteGreaterThan(String value) {
            addCriterion("interest_rate_note >", value, "interestRateNote");
            return (Criteria) this;
        }

        public Criteria andInterestRateNoteGreaterThanOrEqualTo(String value) {
            addCriterion("interest_rate_note >=", value, "interestRateNote");
            return (Criteria) this;
        }

        public Criteria andInterestRateNoteLessThan(String value) {
            addCriterion("interest_rate_note <", value, "interestRateNote");
            return (Criteria) this;
        }

        public Criteria andInterestRateNoteLessThanOrEqualTo(String value) {
            addCriterion("interest_rate_note <=", value, "interestRateNote");
            return (Criteria) this;
        }

        public Criteria andInterestRateNoteLike(String value) {
            addCriterion("interest_rate_note like", value, "interestRateNote");
            return (Criteria) this;
        }

        public Criteria andInterestRateNoteNotLike(String value) {
            addCriterion("interest_rate_note not like", value, "interestRateNote");
            return (Criteria) this;
        }

        public Criteria andInterestRateNoteIn(List<String> values) {
            addCriterion("interest_rate_note in", values, "interestRateNote");
            return (Criteria) this;
        }

        public Criteria andInterestRateNoteNotIn(List<String> values) {
            addCriterion("interest_rate_note not in", values, "interestRateNote");
            return (Criteria) this;
        }

        public Criteria andInterestRateNoteBetween(String value1, String value2) {
            addCriterion("interest_rate_note between", value1, value2, "interestRateNote");
            return (Criteria) this;
        }

        public Criteria andInterestRateNoteNotBetween(String value1, String value2) {
            addCriterion("interest_rate_note not between", value1, value2, "interestRateNote");
            return (Criteria) this;
        }

        public Criteria andInterestRateSpeakIsNull() {
            addCriterion("interest_rate_speak is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateSpeakIsNotNull() {
            addCriterion("interest_rate_speak is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateSpeakEqualTo(String value) {
            addCriterion("interest_rate_speak =", value, "interestRateSpeak");
            return (Criteria) this;
        }

        public Criteria andInterestRateSpeakNotEqualTo(String value) {
            addCriterion("interest_rate_speak <>", value, "interestRateSpeak");
            return (Criteria) this;
        }

        public Criteria andInterestRateSpeakGreaterThan(String value) {
            addCriterion("interest_rate_speak >", value, "interestRateSpeak");
            return (Criteria) this;
        }

        public Criteria andInterestRateSpeakGreaterThanOrEqualTo(String value) {
            addCriterion("interest_rate_speak >=", value, "interestRateSpeak");
            return (Criteria) this;
        }

        public Criteria andInterestRateSpeakLessThan(String value) {
            addCriterion("interest_rate_speak <", value, "interestRateSpeak");
            return (Criteria) this;
        }

        public Criteria andInterestRateSpeakLessThanOrEqualTo(String value) {
            addCriterion("interest_rate_speak <=", value, "interestRateSpeak");
            return (Criteria) this;
        }

        public Criteria andInterestRateSpeakLike(String value) {
            addCriterion("interest_rate_speak like", value, "interestRateSpeak");
            return (Criteria) this;
        }

        public Criteria andInterestRateSpeakNotLike(String value) {
            addCriterion("interest_rate_speak not like", value, "interestRateSpeak");
            return (Criteria) this;
        }

        public Criteria andInterestRateSpeakIn(List<String> values) {
            addCriterion("interest_rate_speak in", values, "interestRateSpeak");
            return (Criteria) this;
        }

        public Criteria andInterestRateSpeakNotIn(List<String> values) {
            addCriterion("interest_rate_speak not in", values, "interestRateSpeak");
            return (Criteria) this;
        }

        public Criteria andInterestRateSpeakBetween(String value1, String value2) {
            addCriterion("interest_rate_speak between", value1, value2, "interestRateSpeak");
            return (Criteria) this;
        }

        public Criteria andInterestRateSpeakNotBetween(String value1, String value2) {
            addCriterion("interest_rate_speak not between", value1, value2, "interestRateSpeak");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreaterIsNull() {
            addCriterion("interest_rate_creater is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreaterIsNotNull() {
            addCriterion("interest_rate_creater is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreaterEqualTo(String value) {
            addCriterion("interest_rate_creater =", value, "interestRateCreater");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreaterNotEqualTo(String value) {
            addCriterion("interest_rate_creater <>", value, "interestRateCreater");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreaterGreaterThan(String value) {
            addCriterion("interest_rate_creater >", value, "interestRateCreater");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("interest_rate_creater >=", value, "interestRateCreater");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreaterLessThan(String value) {
            addCriterion("interest_rate_creater <", value, "interestRateCreater");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreaterLessThanOrEqualTo(String value) {
            addCriterion("interest_rate_creater <=", value, "interestRateCreater");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreaterLike(String value) {
            addCriterion("interest_rate_creater like", value, "interestRateCreater");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreaterNotLike(String value) {
            addCriterion("interest_rate_creater not like", value, "interestRateCreater");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreaterIn(List<String> values) {
            addCriterion("interest_rate_creater in", values, "interestRateCreater");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreaterNotIn(List<String> values) {
            addCriterion("interest_rate_creater not in", values, "interestRateCreater");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreaterBetween(String value1, String value2) {
            addCriterion("interest_rate_creater between", value1, value2, "interestRateCreater");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreaterNotBetween(String value1, String value2) {
            addCriterion("interest_rate_creater not between", value1, value2, "interestRateCreater");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreatetimeIsNull() {
            addCriterion("interest_rate_createtime is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreatetimeIsNotNull() {
            addCriterion("interest_rate_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreatetimeEqualTo(Date value) {
            addCriterion("interest_rate_createtime =", value, "interestRateCreatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreatetimeNotEqualTo(Date value) {
            addCriterion("interest_rate_createtime <>", value, "interestRateCreatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreatetimeGreaterThan(Date value) {
            addCriterion("interest_rate_createtime >", value, "interestRateCreatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("interest_rate_createtime >=", value, "interestRateCreatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreatetimeLessThan(Date value) {
            addCriterion("interest_rate_createtime <", value, "interestRateCreatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("interest_rate_createtime <=", value, "interestRateCreatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreatetimeIn(List<Date> values) {
            addCriterion("interest_rate_createtime in", values, "interestRateCreatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreatetimeNotIn(List<Date> values) {
            addCriterion("interest_rate_createtime not in", values, "interestRateCreatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreatetimeBetween(Date value1, Date value2) {
            addCriterion("interest_rate_createtime between", value1, value2, "interestRateCreatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("interest_rate_createtime not between", value1, value2, "interestRateCreatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateUpdatetimeIsNull() {
            addCriterion("interest_rate_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateUpdatetimeIsNotNull() {
            addCriterion("interest_rate_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateUpdatetimeEqualTo(Date value) {
            addCriterion("interest_rate_updatetime =", value, "interestRateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateUpdatetimeNotEqualTo(Date value) {
            addCriterion("interest_rate_updatetime <>", value, "interestRateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateUpdatetimeGreaterThan(Date value) {
            addCriterion("interest_rate_updatetime >", value, "interestRateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("interest_rate_updatetime >=", value, "interestRateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateUpdatetimeLessThan(Date value) {
            addCriterion("interest_rate_updatetime <", value, "interestRateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("interest_rate_updatetime <=", value, "interestRateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateUpdatetimeIn(List<Date> values) {
            addCriterion("interest_rate_updatetime in", values, "interestRateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateUpdatetimeNotIn(List<Date> values) {
            addCriterion("interest_rate_updatetime not in", values, "interestRateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("interest_rate_updatetime between", value1, value2, "interestRateUpdatetime");
            return (Criteria) this;
        }

        public Criteria andInterestRateUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("interest_rate_updatetime not between", value1, value2, "interestRateUpdatetime");
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