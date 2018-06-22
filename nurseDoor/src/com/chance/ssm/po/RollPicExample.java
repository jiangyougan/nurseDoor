package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RollPicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RollPicExample() {
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

        public Criteria andRollPicIdIsNull() {
            addCriterion("roll_pic_id is null");
            return (Criteria) this;
        }

        public Criteria andRollPicIdIsNotNull() {
            addCriterion("roll_pic_id is not null");
            return (Criteria) this;
        }

        public Criteria andRollPicIdEqualTo(String value) {
            addCriterion("roll_pic_id =", value, "rollPicId");
            return (Criteria) this;
        }

        public Criteria andRollPicIdNotEqualTo(String value) {
            addCriterion("roll_pic_id <>", value, "rollPicId");
            return (Criteria) this;
        }

        public Criteria andRollPicIdGreaterThan(String value) {
            addCriterion("roll_pic_id >", value, "rollPicId");
            return (Criteria) this;
        }

        public Criteria andRollPicIdGreaterThanOrEqualTo(String value) {
            addCriterion("roll_pic_id >=", value, "rollPicId");
            return (Criteria) this;
        }

        public Criteria andRollPicIdLessThan(String value) {
            addCriterion("roll_pic_id <", value, "rollPicId");
            return (Criteria) this;
        }

        public Criteria andRollPicIdLessThanOrEqualTo(String value) {
            addCriterion("roll_pic_id <=", value, "rollPicId");
            return (Criteria) this;
        }

        public Criteria andRollPicIdLike(String value) {
            addCriterion("roll_pic_id like", value, "rollPicId");
            return (Criteria) this;
        }

        public Criteria andRollPicIdNotLike(String value) {
            addCriterion("roll_pic_id not like", value, "rollPicId");
            return (Criteria) this;
        }

        public Criteria andRollPicIdIn(List<String> values) {
            addCriterion("roll_pic_id in", values, "rollPicId");
            return (Criteria) this;
        }

        public Criteria andRollPicIdNotIn(List<String> values) {
            addCriterion("roll_pic_id not in", values, "rollPicId");
            return (Criteria) this;
        }

        public Criteria andRollPicIdBetween(String value1, String value2) {
            addCriterion("roll_pic_id between", value1, value2, "rollPicId");
            return (Criteria) this;
        }

        public Criteria andRollPicIdNotBetween(String value1, String value2) {
            addCriterion("roll_pic_id not between", value1, value2, "rollPicId");
            return (Criteria) this;
        }

        public Criteria andRollPicUrlIsNull() {
            addCriterion("roll_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andRollPicUrlIsNotNull() {
            addCriterion("roll_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andRollPicUrlEqualTo(String value) {
            addCriterion("roll_pic_url =", value, "rollPicUrl");
            return (Criteria) this;
        }

        public Criteria andRollPicUrlNotEqualTo(String value) {
            addCriterion("roll_pic_url <>", value, "rollPicUrl");
            return (Criteria) this;
        }

        public Criteria andRollPicUrlGreaterThan(String value) {
            addCriterion("roll_pic_url >", value, "rollPicUrl");
            return (Criteria) this;
        }

        public Criteria andRollPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("roll_pic_url >=", value, "rollPicUrl");
            return (Criteria) this;
        }

        public Criteria andRollPicUrlLessThan(String value) {
            addCriterion("roll_pic_url <", value, "rollPicUrl");
            return (Criteria) this;
        }

        public Criteria andRollPicUrlLessThanOrEqualTo(String value) {
            addCriterion("roll_pic_url <=", value, "rollPicUrl");
            return (Criteria) this;
        }

        public Criteria andRollPicUrlLike(String value) {
            addCriterion("roll_pic_url like", value, "rollPicUrl");
            return (Criteria) this;
        }

        public Criteria andRollPicUrlNotLike(String value) {
            addCriterion("roll_pic_url not like", value, "rollPicUrl");
            return (Criteria) this;
        }

        public Criteria andRollPicUrlIn(List<String> values) {
            addCriterion("roll_pic_url in", values, "rollPicUrl");
            return (Criteria) this;
        }

        public Criteria andRollPicUrlNotIn(List<String> values) {
            addCriterion("roll_pic_url not in", values, "rollPicUrl");
            return (Criteria) this;
        }

        public Criteria andRollPicUrlBetween(String value1, String value2) {
            addCriterion("roll_pic_url between", value1, value2, "rollPicUrl");
            return (Criteria) this;
        }

        public Criteria andRollPicUrlNotBetween(String value1, String value2) {
            addCriterion("roll_pic_url not between", value1, value2, "rollPicUrl");
            return (Criteria) this;
        }

        public Criteria andRollPicAddressIsNull() {
            addCriterion("roll_pic_address is null");
            return (Criteria) this;
        }

        public Criteria andRollPicAddressIsNotNull() {
            addCriterion("roll_pic_address is not null");
            return (Criteria) this;
        }

        public Criteria andRollPicAddressEqualTo(String value) {
            addCriterion("roll_pic_address =", value, "rollPicAddress");
            return (Criteria) this;
        }

        public Criteria andRollPicAddressNotEqualTo(String value) {
            addCriterion("roll_pic_address <>", value, "rollPicAddress");
            return (Criteria) this;
        }

        public Criteria andRollPicAddressGreaterThan(String value) {
            addCriterion("roll_pic_address >", value, "rollPicAddress");
            return (Criteria) this;
        }

        public Criteria andRollPicAddressGreaterThanOrEqualTo(String value) {
            addCriterion("roll_pic_address >=", value, "rollPicAddress");
            return (Criteria) this;
        }

        public Criteria andRollPicAddressLessThan(String value) {
            addCriterion("roll_pic_address <", value, "rollPicAddress");
            return (Criteria) this;
        }

        public Criteria andRollPicAddressLessThanOrEqualTo(String value) {
            addCriterion("roll_pic_address <=", value, "rollPicAddress");
            return (Criteria) this;
        }

        public Criteria andRollPicAddressLike(String value) {
            addCriterion("roll_pic_address like", value, "rollPicAddress");
            return (Criteria) this;
        }

        public Criteria andRollPicAddressNotLike(String value) {
            addCriterion("roll_pic_address not like", value, "rollPicAddress");
            return (Criteria) this;
        }

        public Criteria andRollPicAddressIn(List<String> values) {
            addCriterion("roll_pic_address in", values, "rollPicAddress");
            return (Criteria) this;
        }

        public Criteria andRollPicAddressNotIn(List<String> values) {
            addCriterion("roll_pic_address not in", values, "rollPicAddress");
            return (Criteria) this;
        }

        public Criteria andRollPicAddressBetween(String value1, String value2) {
            addCriterion("roll_pic_address between", value1, value2, "rollPicAddress");
            return (Criteria) this;
        }

        public Criteria andRollPicAddressNotBetween(String value1, String value2) {
            addCriterion("roll_pic_address not between", value1, value2, "rollPicAddress");
            return (Criteria) this;
        }

        public Criteria andRollPicNoteIsNull() {
            addCriterion("roll_pic_note is null");
            return (Criteria) this;
        }

        public Criteria andRollPicNoteIsNotNull() {
            addCriterion("roll_pic_note is not null");
            return (Criteria) this;
        }

        public Criteria andRollPicNoteEqualTo(String value) {
            addCriterion("roll_pic_note =", value, "rollPicNote");
            return (Criteria) this;
        }

        public Criteria andRollPicNoteNotEqualTo(String value) {
            addCriterion("roll_pic_note <>", value, "rollPicNote");
            return (Criteria) this;
        }

        public Criteria andRollPicNoteGreaterThan(String value) {
            addCriterion("roll_pic_note >", value, "rollPicNote");
            return (Criteria) this;
        }

        public Criteria andRollPicNoteGreaterThanOrEqualTo(String value) {
            addCriterion("roll_pic_note >=", value, "rollPicNote");
            return (Criteria) this;
        }

        public Criteria andRollPicNoteLessThan(String value) {
            addCriterion("roll_pic_note <", value, "rollPicNote");
            return (Criteria) this;
        }

        public Criteria andRollPicNoteLessThanOrEqualTo(String value) {
            addCriterion("roll_pic_note <=", value, "rollPicNote");
            return (Criteria) this;
        }

        public Criteria andRollPicNoteLike(String value) {
            addCriterion("roll_pic_note like", value, "rollPicNote");
            return (Criteria) this;
        }

        public Criteria andRollPicNoteNotLike(String value) {
            addCriterion("roll_pic_note not like", value, "rollPicNote");
            return (Criteria) this;
        }

        public Criteria andRollPicNoteIn(List<String> values) {
            addCriterion("roll_pic_note in", values, "rollPicNote");
            return (Criteria) this;
        }

        public Criteria andRollPicNoteNotIn(List<String> values) {
            addCriterion("roll_pic_note not in", values, "rollPicNote");
            return (Criteria) this;
        }

        public Criteria andRollPicNoteBetween(String value1, String value2) {
            addCriterion("roll_pic_note between", value1, value2, "rollPicNote");
            return (Criteria) this;
        }

        public Criteria andRollPicNoteNotBetween(String value1, String value2) {
            addCriterion("roll_pic_note not between", value1, value2, "rollPicNote");
            return (Criteria) this;
        }

        public Criteria andRollPicSpeakIsNull() {
            addCriterion("roll_pic_speak is null");
            return (Criteria) this;
        }

        public Criteria andRollPicSpeakIsNotNull() {
            addCriterion("roll_pic_speak is not null");
            return (Criteria) this;
        }

        public Criteria andRollPicSpeakEqualTo(String value) {
            addCriterion("roll_pic_speak =", value, "rollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andRollPicSpeakNotEqualTo(String value) {
            addCriterion("roll_pic_speak <>", value, "rollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andRollPicSpeakGreaterThan(String value) {
            addCriterion("roll_pic_speak >", value, "rollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andRollPicSpeakGreaterThanOrEqualTo(String value) {
            addCriterion("roll_pic_speak >=", value, "rollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andRollPicSpeakLessThan(String value) {
            addCriterion("roll_pic_speak <", value, "rollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andRollPicSpeakLessThanOrEqualTo(String value) {
            addCriterion("roll_pic_speak <=", value, "rollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andRollPicSpeakLike(String value) {
            addCriterion("roll_pic_speak like", value, "rollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andRollPicSpeakNotLike(String value) {
            addCriterion("roll_pic_speak not like", value, "rollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andRollPicSpeakIn(List<String> values) {
            addCriterion("roll_pic_speak in", values, "rollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andRollPicSpeakNotIn(List<String> values) {
            addCriterion("roll_pic_speak not in", values, "rollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andRollPicSpeakBetween(String value1, String value2) {
            addCriterion("roll_pic_speak between", value1, value2, "rollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andRollPicSpeakNotBetween(String value1, String value2) {
            addCriterion("roll_pic_speak not between", value1, value2, "rollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andRollPicCreaterIsNull() {
            addCriterion("roll_pic_creater is null");
            return (Criteria) this;
        }

        public Criteria andRollPicCreaterIsNotNull() {
            addCriterion("roll_pic_creater is not null");
            return (Criteria) this;
        }

        public Criteria andRollPicCreaterEqualTo(String value) {
            addCriterion("roll_pic_creater =", value, "rollPicCreater");
            return (Criteria) this;
        }

        public Criteria andRollPicCreaterNotEqualTo(String value) {
            addCriterion("roll_pic_creater <>", value, "rollPicCreater");
            return (Criteria) this;
        }

        public Criteria andRollPicCreaterGreaterThan(String value) {
            addCriterion("roll_pic_creater >", value, "rollPicCreater");
            return (Criteria) this;
        }

        public Criteria andRollPicCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("roll_pic_creater >=", value, "rollPicCreater");
            return (Criteria) this;
        }

        public Criteria andRollPicCreaterLessThan(String value) {
            addCriterion("roll_pic_creater <", value, "rollPicCreater");
            return (Criteria) this;
        }

        public Criteria andRollPicCreaterLessThanOrEqualTo(String value) {
            addCriterion("roll_pic_creater <=", value, "rollPicCreater");
            return (Criteria) this;
        }

        public Criteria andRollPicCreaterLike(String value) {
            addCriterion("roll_pic_creater like", value, "rollPicCreater");
            return (Criteria) this;
        }

        public Criteria andRollPicCreaterNotLike(String value) {
            addCriterion("roll_pic_creater not like", value, "rollPicCreater");
            return (Criteria) this;
        }

        public Criteria andRollPicCreaterIn(List<String> values) {
            addCriterion("roll_pic_creater in", values, "rollPicCreater");
            return (Criteria) this;
        }

        public Criteria andRollPicCreaterNotIn(List<String> values) {
            addCriterion("roll_pic_creater not in", values, "rollPicCreater");
            return (Criteria) this;
        }

        public Criteria andRollPicCreaterBetween(String value1, String value2) {
            addCriterion("roll_pic_creater between", value1, value2, "rollPicCreater");
            return (Criteria) this;
        }

        public Criteria andRollPicCreaterNotBetween(String value1, String value2) {
            addCriterion("roll_pic_creater not between", value1, value2, "rollPicCreater");
            return (Criteria) this;
        }

        public Criteria andRollPicCreatetimeIsNull() {
            addCriterion("roll_pic_createtime is null");
            return (Criteria) this;
        }

        public Criteria andRollPicCreatetimeIsNotNull() {
            addCriterion("roll_pic_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andRollPicCreatetimeEqualTo(Date value) {
            addCriterion("roll_pic_createtime =", value, "rollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andRollPicCreatetimeNotEqualTo(Date value) {
            addCriterion("roll_pic_createtime <>", value, "rollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andRollPicCreatetimeGreaterThan(Date value) {
            addCriterion("roll_pic_createtime >", value, "rollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andRollPicCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("roll_pic_createtime >=", value, "rollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andRollPicCreatetimeLessThan(Date value) {
            addCriterion("roll_pic_createtime <", value, "rollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andRollPicCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("roll_pic_createtime <=", value, "rollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andRollPicCreatetimeIn(List<Date> values) {
            addCriterion("roll_pic_createtime in", values, "rollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andRollPicCreatetimeNotIn(List<Date> values) {
            addCriterion("roll_pic_createtime not in", values, "rollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andRollPicCreatetimeBetween(Date value1, Date value2) {
            addCriterion("roll_pic_createtime between", value1, value2, "rollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andRollPicCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("roll_pic_createtime not between", value1, value2, "rollPicCreatetime");
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