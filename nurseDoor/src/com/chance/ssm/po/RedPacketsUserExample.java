package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RedPacketsUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RedPacketsUserExample() {
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

        public Criteria andRedPacketsNurseIdIsNull() {
            addCriterion("red_packets_nurse_id is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseIdIsNotNull() {
            addCriterion("red_packets_nurse_id is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseIdEqualTo(String value) {
            addCriterion("red_packets_nurse_id =", value, "redPacketsNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseIdNotEqualTo(String value) {
            addCriterion("red_packets_nurse_id <>", value, "redPacketsNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseIdGreaterThan(String value) {
            addCriterion("red_packets_nurse_id >", value, "redPacketsNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseIdGreaterThanOrEqualTo(String value) {
            addCriterion("red_packets_nurse_id >=", value, "redPacketsNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseIdLessThan(String value) {
            addCriterion("red_packets_nurse_id <", value, "redPacketsNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseIdLessThanOrEqualTo(String value) {
            addCriterion("red_packets_nurse_id <=", value, "redPacketsNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseIdLike(String value) {
            addCriterion("red_packets_nurse_id like", value, "redPacketsNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseIdNotLike(String value) {
            addCriterion("red_packets_nurse_id not like", value, "redPacketsNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseIdIn(List<String> values) {
            addCriterion("red_packets_nurse_id in", values, "redPacketsNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseIdNotIn(List<String> values) {
            addCriterion("red_packets_nurse_id not in", values, "redPacketsNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseIdBetween(String value1, String value2) {
            addCriterion("red_packets_nurse_id between", value1, value2, "redPacketsNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseIdNotBetween(String value1, String value2) {
            addCriterion("red_packets_nurse_id not between", value1, value2, "redPacketsNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNursePicIsNull() {
            addCriterion("red_packets_nurse_pic is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNursePicIsNotNull() {
            addCriterion("red_packets_nurse_pic is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNursePicEqualTo(String value) {
            addCriterion("red_packets_nurse_pic =", value, "redPacketsNursePic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNursePicNotEqualTo(String value) {
            addCriterion("red_packets_nurse_pic <>", value, "redPacketsNursePic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNursePicGreaterThan(String value) {
            addCriterion("red_packets_nurse_pic >", value, "redPacketsNursePic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNursePicGreaterThanOrEqualTo(String value) {
            addCriterion("red_packets_nurse_pic >=", value, "redPacketsNursePic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNursePicLessThan(String value) {
            addCriterion("red_packets_nurse_pic <", value, "redPacketsNursePic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNursePicLessThanOrEqualTo(String value) {
            addCriterion("red_packets_nurse_pic <=", value, "redPacketsNursePic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNursePicLike(String value) {
            addCriterion("red_packets_nurse_pic like", value, "redPacketsNursePic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNursePicNotLike(String value) {
            addCriterion("red_packets_nurse_pic not like", value, "redPacketsNursePic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNursePicIn(List<String> values) {
            addCriterion("red_packets_nurse_pic in", values, "redPacketsNursePic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNursePicNotIn(List<String> values) {
            addCriterion("red_packets_nurse_pic not in", values, "redPacketsNursePic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNursePicBetween(String value1, String value2) {
            addCriterion("red_packets_nurse_pic between", value1, value2, "redPacketsNursePic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNursePicNotBetween(String value1, String value2) {
            addCriterion("red_packets_nurse_pic not between", value1, value2, "redPacketsNursePic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseMoneyIsNull() {
            addCriterion("red_packets_nurse_money is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseMoneyIsNotNull() {
            addCriterion("red_packets_nurse_money is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseMoneyEqualTo(BigDecimal value) {
            addCriterion("red_packets_nurse_money =", value, "redPacketsNurseMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseMoneyNotEqualTo(BigDecimal value) {
            addCriterion("red_packets_nurse_money <>", value, "redPacketsNurseMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseMoneyGreaterThan(BigDecimal value) {
            addCriterion("red_packets_nurse_money >", value, "redPacketsNurseMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("red_packets_nurse_money >=", value, "redPacketsNurseMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseMoneyLessThan(BigDecimal value) {
            addCriterion("red_packets_nurse_money <", value, "redPacketsNurseMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("red_packets_nurse_money <=", value, "redPacketsNurseMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseMoneyIn(List<BigDecimal> values) {
            addCriterion("red_packets_nurse_money in", values, "redPacketsNurseMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseMoneyNotIn(List<BigDecimal> values) {
            addCriterion("red_packets_nurse_money not in", values, "redPacketsNurseMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("red_packets_nurse_money between", value1, value2, "redPacketsNurseMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("red_packets_nurse_money not between", value1, value2, "redPacketsNurseMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNurseIdIsNull() {
            addCriterion("red_packets_nurse_nurse_id is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNurseIdIsNotNull() {
            addCriterion("red_packets_nurse_nurse_id is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNurseIdEqualTo(String value) {
            addCriterion("red_packets_nurse_nurse_id =", value, "redPacketsNurseNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNurseIdNotEqualTo(String value) {
            addCriterion("red_packets_nurse_nurse_id <>", value, "redPacketsNurseNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNurseIdGreaterThan(String value) {
            addCriterion("red_packets_nurse_nurse_id >", value, "redPacketsNurseNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNurseIdGreaterThanOrEqualTo(String value) {
            addCriterion("red_packets_nurse_nurse_id >=", value, "redPacketsNurseNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNurseIdLessThan(String value) {
            addCriterion("red_packets_nurse_nurse_id <", value, "redPacketsNurseNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNurseIdLessThanOrEqualTo(String value) {
            addCriterion("red_packets_nurse_nurse_id <=", value, "redPacketsNurseNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNurseIdLike(String value) {
            addCriterion("red_packets_nurse_nurse_id like", value, "redPacketsNurseNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNurseIdNotLike(String value) {
            addCriterion("red_packets_nurse_nurse_id not like", value, "redPacketsNurseNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNurseIdIn(List<String> values) {
            addCriterion("red_packets_nurse_nurse_id in", values, "redPacketsNurseNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNurseIdNotIn(List<String> values) {
            addCriterion("red_packets_nurse_nurse_id not in", values, "redPacketsNurseNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNurseIdBetween(String value1, String value2) {
            addCriterion("red_packets_nurse_nurse_id between", value1, value2, "redPacketsNurseNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNurseIdNotBetween(String value1, String value2) {
            addCriterion("red_packets_nurse_nurse_id not between", value1, value2, "redPacketsNurseNurseId");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNoteIsNull() {
            addCriterion("red_packets_nurse_note is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNoteIsNotNull() {
            addCriterion("red_packets_nurse_note is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNoteEqualTo(String value) {
            addCriterion("red_packets_nurse_note =", value, "redPacketsNurseNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNoteNotEqualTo(String value) {
            addCriterion("red_packets_nurse_note <>", value, "redPacketsNurseNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNoteGreaterThan(String value) {
            addCriterion("red_packets_nurse_note >", value, "redPacketsNurseNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNoteGreaterThanOrEqualTo(String value) {
            addCriterion("red_packets_nurse_note >=", value, "redPacketsNurseNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNoteLessThan(String value) {
            addCriterion("red_packets_nurse_note <", value, "redPacketsNurseNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNoteLessThanOrEqualTo(String value) {
            addCriterion("red_packets_nurse_note <=", value, "redPacketsNurseNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNoteLike(String value) {
            addCriterion("red_packets_nurse_note like", value, "redPacketsNurseNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNoteNotLike(String value) {
            addCriterion("red_packets_nurse_note not like", value, "redPacketsNurseNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNoteIn(List<String> values) {
            addCriterion("red_packets_nurse_note in", values, "redPacketsNurseNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNoteNotIn(List<String> values) {
            addCriterion("red_packets_nurse_note not in", values, "redPacketsNurseNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNoteBetween(String value1, String value2) {
            addCriterion("red_packets_nurse_note between", value1, value2, "redPacketsNurseNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseNoteNotBetween(String value1, String value2) {
            addCriterion("red_packets_nurse_note not between", value1, value2, "redPacketsNurseNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseSpeakIsNull() {
            addCriterion("red_packets_nurse_speak is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseSpeakIsNotNull() {
            addCriterion("red_packets_nurse_speak is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseSpeakEqualTo(String value) {
            addCriterion("red_packets_nurse_speak =", value, "redPacketsNurseSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseSpeakNotEqualTo(String value) {
            addCriterion("red_packets_nurse_speak <>", value, "redPacketsNurseSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseSpeakGreaterThan(String value) {
            addCriterion("red_packets_nurse_speak >", value, "redPacketsNurseSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseSpeakGreaterThanOrEqualTo(String value) {
            addCriterion("red_packets_nurse_speak >=", value, "redPacketsNurseSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseSpeakLessThan(String value) {
            addCriterion("red_packets_nurse_speak <", value, "redPacketsNurseSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseSpeakLessThanOrEqualTo(String value) {
            addCriterion("red_packets_nurse_speak <=", value, "redPacketsNurseSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseSpeakLike(String value) {
            addCriterion("red_packets_nurse_speak like", value, "redPacketsNurseSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseSpeakNotLike(String value) {
            addCriterion("red_packets_nurse_speak not like", value, "redPacketsNurseSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseSpeakIn(List<String> values) {
            addCriterion("red_packets_nurse_speak in", values, "redPacketsNurseSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseSpeakNotIn(List<String> values) {
            addCriterion("red_packets_nurse_speak not in", values, "redPacketsNurseSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseSpeakBetween(String value1, String value2) {
            addCriterion("red_packets_nurse_speak between", value1, value2, "redPacketsNurseSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseSpeakNotBetween(String value1, String value2) {
            addCriterion("red_packets_nurse_speak not between", value1, value2, "redPacketsNurseSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreaterIsNull() {
            addCriterion("red_packets_nurse_creater is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreaterIsNotNull() {
            addCriterion("red_packets_nurse_creater is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreaterEqualTo(String value) {
            addCriterion("red_packets_nurse_creater =", value, "redPacketsNurseCreater");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreaterNotEqualTo(String value) {
            addCriterion("red_packets_nurse_creater <>", value, "redPacketsNurseCreater");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreaterGreaterThan(String value) {
            addCriterion("red_packets_nurse_creater >", value, "redPacketsNurseCreater");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("red_packets_nurse_creater >=", value, "redPacketsNurseCreater");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreaterLessThan(String value) {
            addCriterion("red_packets_nurse_creater <", value, "redPacketsNurseCreater");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreaterLessThanOrEqualTo(String value) {
            addCriterion("red_packets_nurse_creater <=", value, "redPacketsNurseCreater");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreaterLike(String value) {
            addCriterion("red_packets_nurse_creater like", value, "redPacketsNurseCreater");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreaterNotLike(String value) {
            addCriterion("red_packets_nurse_creater not like", value, "redPacketsNurseCreater");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreaterIn(List<String> values) {
            addCriterion("red_packets_nurse_creater in", values, "redPacketsNurseCreater");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreaterNotIn(List<String> values) {
            addCriterion("red_packets_nurse_creater not in", values, "redPacketsNurseCreater");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreaterBetween(String value1, String value2) {
            addCriterion("red_packets_nurse_creater between", value1, value2, "redPacketsNurseCreater");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreaterNotBetween(String value1, String value2) {
            addCriterion("red_packets_nurse_creater not between", value1, value2, "redPacketsNurseCreater");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreatetimeIsNull() {
            addCriterion("red_packets_nurse_createtime is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreatetimeIsNotNull() {
            addCriterion("red_packets_nurse_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreatetimeEqualTo(Date value) {
            addCriterion("red_packets_nurse_createtime =", value, "redPacketsNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreatetimeNotEqualTo(Date value) {
            addCriterion("red_packets_nurse_createtime <>", value, "redPacketsNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreatetimeGreaterThan(Date value) {
            addCriterion("red_packets_nurse_createtime >", value, "redPacketsNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("red_packets_nurse_createtime >=", value, "redPacketsNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreatetimeLessThan(Date value) {
            addCriterion("red_packets_nurse_createtime <", value, "redPacketsNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("red_packets_nurse_createtime <=", value, "redPacketsNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreatetimeIn(List<Date> values) {
            addCriterion("red_packets_nurse_createtime in", values, "redPacketsNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreatetimeNotIn(List<Date> values) {
            addCriterion("red_packets_nurse_createtime not in", values, "redPacketsNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreatetimeBetween(Date value1, Date value2) {
            addCriterion("red_packets_nurse_createtime between", value1, value2, "redPacketsNurseCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNurseCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("red_packets_nurse_createtime not between", value1, value2, "redPacketsNurseCreatetime");
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