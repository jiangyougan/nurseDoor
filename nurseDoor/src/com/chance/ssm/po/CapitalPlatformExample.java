package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CapitalPlatformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CapitalPlatformExample() {
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

        public Criteria andCapitalPlatformIdIsNull() {
            addCriterion("capital_platform_id is null");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformIdIsNotNull() {
            addCriterion("capital_platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformIdEqualTo(Integer value) {
            addCriterion("capital_platform_id =", value, "capitalPlatformId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformIdNotEqualTo(Integer value) {
            addCriterion("capital_platform_id <>", value, "capitalPlatformId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformIdGreaterThan(Integer value) {
            addCriterion("capital_platform_id >", value, "capitalPlatformId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("capital_platform_id >=", value, "capitalPlatformId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformIdLessThan(Integer value) {
            addCriterion("capital_platform_id <", value, "capitalPlatformId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformIdLessThanOrEqualTo(Integer value) {
            addCriterion("capital_platform_id <=", value, "capitalPlatformId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformIdIn(List<Integer> values) {
            addCriterion("capital_platform_id in", values, "capitalPlatformId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformIdNotIn(List<Integer> values) {
            addCriterion("capital_platform_id not in", values, "capitalPlatformId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformIdBetween(Integer value1, Integer value2) {
            addCriterion("capital_platform_id between", value1, value2, "capitalPlatformId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformIdNotBetween(Integer value1, Integer value2) {
            addCriterion("capital_platform_id not between", value1, value2, "capitalPlatformId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformMoneyIsNull() {
            addCriterion("capital_platform_money is null");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformMoneyIsNotNull() {
            addCriterion("capital_platform_money is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformMoneyEqualTo(BigDecimal value) {
            addCriterion("capital_platform_money =", value, "capitalPlatformMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformMoneyNotEqualTo(BigDecimal value) {
            addCriterion("capital_platform_money <>", value, "capitalPlatformMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformMoneyGreaterThan(BigDecimal value) {
            addCriterion("capital_platform_money >", value, "capitalPlatformMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("capital_platform_money >=", value, "capitalPlatformMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformMoneyLessThan(BigDecimal value) {
            addCriterion("capital_platform_money <", value, "capitalPlatformMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("capital_platform_money <=", value, "capitalPlatformMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformMoneyIn(List<BigDecimal> values) {
            addCriterion("capital_platform_money in", values, "capitalPlatformMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformMoneyNotIn(List<BigDecimal> values) {
            addCriterion("capital_platform_money not in", values, "capitalPlatformMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital_platform_money between", value1, value2, "capitalPlatformMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital_platform_money not between", value1, value2, "capitalPlatformMoney");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOrderSendIdIsNull() {
            addCriterion("capital_platform_order_send_id is null");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOrderSendIdIsNotNull() {
            addCriterion("capital_platform_order_send_id is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOrderSendIdEqualTo(String value) {
            addCriterion("capital_platform_order_send_id =", value, "capitalPlatformOrderSendId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOrderSendIdNotEqualTo(String value) {
            addCriterion("capital_platform_order_send_id <>", value, "capitalPlatformOrderSendId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOrderSendIdGreaterThan(String value) {
            addCriterion("capital_platform_order_send_id >", value, "capitalPlatformOrderSendId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOrderSendIdGreaterThanOrEqualTo(String value) {
            addCriterion("capital_platform_order_send_id >=", value, "capitalPlatformOrderSendId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOrderSendIdLessThan(String value) {
            addCriterion("capital_platform_order_send_id <", value, "capitalPlatformOrderSendId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOrderSendIdLessThanOrEqualTo(String value) {
            addCriterion("capital_platform_order_send_id <=", value, "capitalPlatformOrderSendId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOrderSendIdLike(String value) {
            addCriterion("capital_platform_order_send_id like", value, "capitalPlatformOrderSendId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOrderSendIdNotLike(String value) {
            addCriterion("capital_platform_order_send_id not like", value, "capitalPlatformOrderSendId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOrderSendIdIn(List<String> values) {
            addCriterion("capital_platform_order_send_id in", values, "capitalPlatformOrderSendId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOrderSendIdNotIn(List<String> values) {
            addCriterion("capital_platform_order_send_id not in", values, "capitalPlatformOrderSendId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOrderSendIdBetween(String value1, String value2) {
            addCriterion("capital_platform_order_send_id between", value1, value2, "capitalPlatformOrderSendId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOrderSendIdNotBetween(String value1, String value2) {
            addCriterion("capital_platform_order_send_id not between", value1, value2, "capitalPlatformOrderSendId");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformNoteIsNull() {
            addCriterion("capital_platform_note is null");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformNoteIsNotNull() {
            addCriterion("capital_platform_note is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformNoteEqualTo(String value) {
            addCriterion("capital_platform_note =", value, "capitalPlatformNote");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformNoteNotEqualTo(String value) {
            addCriterion("capital_platform_note <>", value, "capitalPlatformNote");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformNoteGreaterThan(String value) {
            addCriterion("capital_platform_note >", value, "capitalPlatformNote");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformNoteGreaterThanOrEqualTo(String value) {
            addCriterion("capital_platform_note >=", value, "capitalPlatformNote");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformNoteLessThan(String value) {
            addCriterion("capital_platform_note <", value, "capitalPlatformNote");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformNoteLessThanOrEqualTo(String value) {
            addCriterion("capital_platform_note <=", value, "capitalPlatformNote");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformNoteLike(String value) {
            addCriterion("capital_platform_note like", value, "capitalPlatformNote");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformNoteNotLike(String value) {
            addCriterion("capital_platform_note not like", value, "capitalPlatformNote");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformNoteIn(List<String> values) {
            addCriterion("capital_platform_note in", values, "capitalPlatformNote");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformNoteNotIn(List<String> values) {
            addCriterion("capital_platform_note not in", values, "capitalPlatformNote");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformNoteBetween(String value1, String value2) {
            addCriterion("capital_platform_note between", value1, value2, "capitalPlatformNote");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformNoteNotBetween(String value1, String value2) {
            addCriterion("capital_platform_note not between", value1, value2, "capitalPlatformNote");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformSpeakIsNull() {
            addCriterion("capital_platform_speak is null");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformSpeakIsNotNull() {
            addCriterion("capital_platform_speak is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformSpeakEqualTo(String value) {
            addCriterion("capital_platform_speak =", value, "capitalPlatformSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformSpeakNotEqualTo(String value) {
            addCriterion("capital_platform_speak <>", value, "capitalPlatformSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformSpeakGreaterThan(String value) {
            addCriterion("capital_platform_speak >", value, "capitalPlatformSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformSpeakGreaterThanOrEqualTo(String value) {
            addCriterion("capital_platform_speak >=", value, "capitalPlatformSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformSpeakLessThan(String value) {
            addCriterion("capital_platform_speak <", value, "capitalPlatformSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformSpeakLessThanOrEqualTo(String value) {
            addCriterion("capital_platform_speak <=", value, "capitalPlatformSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformSpeakLike(String value) {
            addCriterion("capital_platform_speak like", value, "capitalPlatformSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformSpeakNotLike(String value) {
            addCriterion("capital_platform_speak not like", value, "capitalPlatformSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformSpeakIn(List<String> values) {
            addCriterion("capital_platform_speak in", values, "capitalPlatformSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformSpeakNotIn(List<String> values) {
            addCriterion("capital_platform_speak not in", values, "capitalPlatformSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformSpeakBetween(String value1, String value2) {
            addCriterion("capital_platform_speak between", value1, value2, "capitalPlatformSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformSpeakNotBetween(String value1, String value2) {
            addCriterion("capital_platform_speak not between", value1, value2, "capitalPlatformSpeak");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOverIsNull() {
            addCriterion("capital_platform_over is null");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOverIsNotNull() {
            addCriterion("capital_platform_over is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOverEqualTo(String value) {
            addCriterion("capital_platform_over =", value, "capitalPlatformOver");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOverNotEqualTo(String value) {
            addCriterion("capital_platform_over <>", value, "capitalPlatformOver");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOverGreaterThan(String value) {
            addCriterion("capital_platform_over >", value, "capitalPlatformOver");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOverGreaterThanOrEqualTo(String value) {
            addCriterion("capital_platform_over >=", value, "capitalPlatformOver");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOverLessThan(String value) {
            addCriterion("capital_platform_over <", value, "capitalPlatformOver");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOverLessThanOrEqualTo(String value) {
            addCriterion("capital_platform_over <=", value, "capitalPlatformOver");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOverLike(String value) {
            addCriterion("capital_platform_over like", value, "capitalPlatformOver");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOverNotLike(String value) {
            addCriterion("capital_platform_over not like", value, "capitalPlatformOver");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOverIn(List<String> values) {
            addCriterion("capital_platform_over in", values, "capitalPlatformOver");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOverNotIn(List<String> values) {
            addCriterion("capital_platform_over not in", values, "capitalPlatformOver");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOverBetween(String value1, String value2) {
            addCriterion("capital_platform_over between", value1, value2, "capitalPlatformOver");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformOverNotBetween(String value1, String value2) {
            addCriterion("capital_platform_over not between", value1, value2, "capitalPlatformOver");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformCreatetimeIsNull() {
            addCriterion("capital_platform_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformCreatetimeIsNotNull() {
            addCriterion("capital_platform_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformCreatetimeEqualTo(Date value) {
            addCriterion("capital_platform_createtime =", value, "capitalPlatformCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformCreatetimeNotEqualTo(Date value) {
            addCriterion("capital_platform_createtime <>", value, "capitalPlatformCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformCreatetimeGreaterThan(Date value) {
            addCriterion("capital_platform_createtime >", value, "capitalPlatformCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("capital_platform_createtime >=", value, "capitalPlatformCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformCreatetimeLessThan(Date value) {
            addCriterion("capital_platform_createtime <", value, "capitalPlatformCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("capital_platform_createtime <=", value, "capitalPlatformCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformCreatetimeIn(List<Date> values) {
            addCriterion("capital_platform_createtime in", values, "capitalPlatformCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformCreatetimeNotIn(List<Date> values) {
            addCriterion("capital_platform_createtime not in", values, "capitalPlatformCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformCreatetimeBetween(Date value1, Date value2) {
            addCriterion("capital_platform_createtime between", value1, value2, "capitalPlatformCreatetime");
            return (Criteria) this;
        }

        public Criteria andCapitalPlatformCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("capital_platform_createtime not between", value1, value2, "capitalPlatformCreatetime");
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