package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RedPacketsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RedPacketsExample() {
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

        public Criteria andRedPacketsIsNull() {
            addCriterion("red_packets is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsIsNotNull() {
            addCriterion("red_packets is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsEqualTo(String value) {
            addCriterion("red_packets =", value, "redPackets");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNotEqualTo(String value) {
            addCriterion("red_packets <>", value, "redPackets");
            return (Criteria) this;
        }

        public Criteria andRedPacketsGreaterThan(String value) {
            addCriterion("red_packets >", value, "redPackets");
            return (Criteria) this;
        }

        public Criteria andRedPacketsGreaterThanOrEqualTo(String value) {
            addCriterion("red_packets >=", value, "redPackets");
            return (Criteria) this;
        }

        public Criteria andRedPacketsLessThan(String value) {
            addCriterion("red_packets <", value, "redPackets");
            return (Criteria) this;
        }

        public Criteria andRedPacketsLessThanOrEqualTo(String value) {
            addCriterion("red_packets <=", value, "redPackets");
            return (Criteria) this;
        }

        public Criteria andRedPacketsLike(String value) {
            addCriterion("red_packets like", value, "redPackets");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNotLike(String value) {
            addCriterion("red_packets not like", value, "redPackets");
            return (Criteria) this;
        }

        public Criteria andRedPacketsIn(List<String> values) {
            addCriterion("red_packets in", values, "redPackets");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNotIn(List<String> values) {
            addCriterion("red_packets not in", values, "redPackets");
            return (Criteria) this;
        }

        public Criteria andRedPacketsBetween(String value1, String value2) {
            addCriterion("red_packets between", value1, value2, "redPackets");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNotBetween(String value1, String value2) {
            addCriterion("red_packets not between", value1, value2, "redPackets");
            return (Criteria) this;
        }

        public Criteria andRedPacketsPicIsNull() {
            addCriterion("red_packets_pic is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsPicIsNotNull() {
            addCriterion("red_packets_pic is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsPicEqualTo(String value) {
            addCriterion("red_packets_pic =", value, "redPacketsPic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsPicNotEqualTo(String value) {
            addCriterion("red_packets_pic <>", value, "redPacketsPic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsPicGreaterThan(String value) {
            addCriterion("red_packets_pic >", value, "redPacketsPic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsPicGreaterThanOrEqualTo(String value) {
            addCriterion("red_packets_pic >=", value, "redPacketsPic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsPicLessThan(String value) {
            addCriterion("red_packets_pic <", value, "redPacketsPic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsPicLessThanOrEqualTo(String value) {
            addCriterion("red_packets_pic <=", value, "redPacketsPic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsPicLike(String value) {
            addCriterion("red_packets_pic like", value, "redPacketsPic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsPicNotLike(String value) {
            addCriterion("red_packets_pic not like", value, "redPacketsPic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsPicIn(List<String> values) {
            addCriterion("red_packets_pic in", values, "redPacketsPic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsPicNotIn(List<String> values) {
            addCriterion("red_packets_pic not in", values, "redPacketsPic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsPicBetween(String value1, String value2) {
            addCriterion("red_packets_pic between", value1, value2, "redPacketsPic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsPicNotBetween(String value1, String value2) {
            addCriterion("red_packets_pic not between", value1, value2, "redPacketsPic");
            return (Criteria) this;
        }

        public Criteria andRedPacketsMoneyIsNull() {
            addCriterion("red_packets_money is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsMoneyIsNotNull() {
            addCriterion("red_packets_money is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsMoneyEqualTo(BigDecimal value) {
            addCriterion("red_packets_money =", value, "redPacketsMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsMoneyNotEqualTo(BigDecimal value) {
            addCriterion("red_packets_money <>", value, "redPacketsMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsMoneyGreaterThan(BigDecimal value) {
            addCriterion("red_packets_money >", value, "redPacketsMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("red_packets_money >=", value, "redPacketsMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsMoneyLessThan(BigDecimal value) {
            addCriterion("red_packets_money <", value, "redPacketsMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("red_packets_money <=", value, "redPacketsMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsMoneyIn(List<BigDecimal> values) {
            addCriterion("red_packets_money in", values, "redPacketsMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsMoneyNotIn(List<BigDecimal> values) {
            addCriterion("red_packets_money not in", values, "redPacketsMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("red_packets_money between", value1, value2, "redPacketsMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("red_packets_money not between", value1, value2, "redPacketsMoney");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNoteIsNull() {
            addCriterion("red_packets_note is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNoteIsNotNull() {
            addCriterion("red_packets_note is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNoteEqualTo(String value) {
            addCriterion("red_packets_note =", value, "redPacketsNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNoteNotEqualTo(String value) {
            addCriterion("red_packets_note <>", value, "redPacketsNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNoteGreaterThan(String value) {
            addCriterion("red_packets_note >", value, "redPacketsNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNoteGreaterThanOrEqualTo(String value) {
            addCriterion("red_packets_note >=", value, "redPacketsNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNoteLessThan(String value) {
            addCriterion("red_packets_note <", value, "redPacketsNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNoteLessThanOrEqualTo(String value) {
            addCriterion("red_packets_note <=", value, "redPacketsNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNoteLike(String value) {
            addCriterion("red_packets_note like", value, "redPacketsNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNoteNotLike(String value) {
            addCriterion("red_packets_note not like", value, "redPacketsNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNoteIn(List<String> values) {
            addCriterion("red_packets_note in", values, "redPacketsNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNoteNotIn(List<String> values) {
            addCriterion("red_packets_note not in", values, "redPacketsNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNoteBetween(String value1, String value2) {
            addCriterion("red_packets_note between", value1, value2, "redPacketsNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsNoteNotBetween(String value1, String value2) {
            addCriterion("red_packets_note not between", value1, value2, "redPacketsNote");
            return (Criteria) this;
        }

        public Criteria andRedPacketsSpeakIsNull() {
            addCriterion("red_packets_speak is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsSpeakIsNotNull() {
            addCriterion("red_packets_speak is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsSpeakEqualTo(String value) {
            addCriterion("red_packets_speak =", value, "redPacketsSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsSpeakNotEqualTo(String value) {
            addCriterion("red_packets_speak <>", value, "redPacketsSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsSpeakGreaterThan(String value) {
            addCriterion("red_packets_speak >", value, "redPacketsSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsSpeakGreaterThanOrEqualTo(String value) {
            addCriterion("red_packets_speak >=", value, "redPacketsSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsSpeakLessThan(String value) {
            addCriterion("red_packets_speak <", value, "redPacketsSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsSpeakLessThanOrEqualTo(String value) {
            addCriterion("red_packets_speak <=", value, "redPacketsSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsSpeakLike(String value) {
            addCriterion("red_packets_speak like", value, "redPacketsSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsSpeakNotLike(String value) {
            addCriterion("red_packets_speak not like", value, "redPacketsSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsSpeakIn(List<String> values) {
            addCriterion("red_packets_speak in", values, "redPacketsSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsSpeakNotIn(List<String> values) {
            addCriterion("red_packets_speak not in", values, "redPacketsSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsSpeakBetween(String value1, String value2) {
            addCriterion("red_packets_speak between", value1, value2, "redPacketsSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsSpeakNotBetween(String value1, String value2) {
            addCriterion("red_packets_speak not between", value1, value2, "redPacketsSpeak");
            return (Criteria) this;
        }

        public Criteria andRedPacketsTypeIsNull() {
            addCriterion("red_packets_type is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsTypeIsNotNull() {
            addCriterion("red_packets_type is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsTypeEqualTo(Integer value) {
            addCriterion("red_packets_type =", value, "redPacketsType");
            return (Criteria) this;
        }

        public Criteria andRedPacketsTypeNotEqualTo(Integer value) {
            addCriterion("red_packets_type <>", value, "redPacketsType");
            return (Criteria) this;
        }

        public Criteria andRedPacketsTypeGreaterThan(Integer value) {
            addCriterion("red_packets_type >", value, "redPacketsType");
            return (Criteria) this;
        }

        public Criteria andRedPacketsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("red_packets_type >=", value, "redPacketsType");
            return (Criteria) this;
        }

        public Criteria andRedPacketsTypeLessThan(Integer value) {
            addCriterion("red_packets_type <", value, "redPacketsType");
            return (Criteria) this;
        }

        public Criteria andRedPacketsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("red_packets_type <=", value, "redPacketsType");
            return (Criteria) this;
        }

        public Criteria andRedPacketsTypeIn(List<Integer> values) {
            addCriterion("red_packets_type in", values, "redPacketsType");
            return (Criteria) this;
        }

        public Criteria andRedPacketsTypeNotIn(List<Integer> values) {
            addCriterion("red_packets_type not in", values, "redPacketsType");
            return (Criteria) this;
        }

        public Criteria andRedPacketsTypeBetween(Integer value1, Integer value2) {
            addCriterion("red_packets_type between", value1, value2, "redPacketsType");
            return (Criteria) this;
        }

        public Criteria andRedPacketsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("red_packets_type not between", value1, value2, "redPacketsType");
            return (Criteria) this;
        }

        public Criteria andRedPacketsCreatetimeIsNull() {
            addCriterion("red_packets_createtime is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsCreatetimeIsNotNull() {
            addCriterion("red_packets_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketsCreatetimeEqualTo(Date value) {
            addCriterion("red_packets_createtime =", value, "redPacketsCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsCreatetimeNotEqualTo(Date value) {
            addCriterion("red_packets_createtime <>", value, "redPacketsCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsCreatetimeGreaterThan(Date value) {
            addCriterion("red_packets_createtime >", value, "redPacketsCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("red_packets_createtime >=", value, "redPacketsCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsCreatetimeLessThan(Date value) {
            addCriterion("red_packets_createtime <", value, "redPacketsCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("red_packets_createtime <=", value, "redPacketsCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsCreatetimeIn(List<Date> values) {
            addCriterion("red_packets_createtime in", values, "redPacketsCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsCreatetimeNotIn(List<Date> values) {
            addCriterion("red_packets_createtime not in", values, "redPacketsCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsCreatetimeBetween(Date value1, Date value2) {
            addCriterion("red_packets_createtime between", value1, value2, "redPacketsCreatetime");
            return (Criteria) this;
        }

        public Criteria andRedPacketsCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("red_packets_createtime not between", value1, value2, "redPacketsCreatetime");
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