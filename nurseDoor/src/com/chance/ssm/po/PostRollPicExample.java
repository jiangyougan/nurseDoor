package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostRollPicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostRollPicExample() {
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

        public Criteria andPostRollPicIdIsNull() {
            addCriterion("post_roll_pic_id is null");
            return (Criteria) this;
        }

        public Criteria andPostRollPicIdIsNotNull() {
            addCriterion("post_roll_pic_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostRollPicIdEqualTo(String value) {
            addCriterion("post_roll_pic_id =", value, "postRollPicId");
            return (Criteria) this;
        }

        public Criteria andPostRollPicIdNotEqualTo(String value) {
            addCriterion("post_roll_pic_id <>", value, "postRollPicId");
            return (Criteria) this;
        }

        public Criteria andPostRollPicIdGreaterThan(String value) {
            addCriterion("post_roll_pic_id >", value, "postRollPicId");
            return (Criteria) this;
        }

        public Criteria andPostRollPicIdGreaterThanOrEqualTo(String value) {
            addCriterion("post_roll_pic_id >=", value, "postRollPicId");
            return (Criteria) this;
        }

        public Criteria andPostRollPicIdLessThan(String value) {
            addCriterion("post_roll_pic_id <", value, "postRollPicId");
            return (Criteria) this;
        }

        public Criteria andPostRollPicIdLessThanOrEqualTo(String value) {
            addCriterion("post_roll_pic_id <=", value, "postRollPicId");
            return (Criteria) this;
        }

        public Criteria andPostRollPicIdLike(String value) {
            addCriterion("post_roll_pic_id like", value, "postRollPicId");
            return (Criteria) this;
        }

        public Criteria andPostRollPicIdNotLike(String value) {
            addCriterion("post_roll_pic_id not like", value, "postRollPicId");
            return (Criteria) this;
        }

        public Criteria andPostRollPicIdIn(List<String> values) {
            addCriterion("post_roll_pic_id in", values, "postRollPicId");
            return (Criteria) this;
        }

        public Criteria andPostRollPicIdNotIn(List<String> values) {
            addCriterion("post_roll_pic_id not in", values, "postRollPicId");
            return (Criteria) this;
        }

        public Criteria andPostRollPicIdBetween(String value1, String value2) {
            addCriterion("post_roll_pic_id between", value1, value2, "postRollPicId");
            return (Criteria) this;
        }

        public Criteria andPostRollPicIdNotBetween(String value1, String value2) {
            addCriterion("post_roll_pic_id not between", value1, value2, "postRollPicId");
            return (Criteria) this;
        }

        public Criteria andPostRollPicUrlIsNull() {
            addCriterion("post_roll_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPostRollPicUrlIsNotNull() {
            addCriterion("post_roll_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPostRollPicUrlEqualTo(String value) {
            addCriterion("post_roll_pic_url =", value, "postRollPicUrl");
            return (Criteria) this;
        }

        public Criteria andPostRollPicUrlNotEqualTo(String value) {
            addCriterion("post_roll_pic_url <>", value, "postRollPicUrl");
            return (Criteria) this;
        }

        public Criteria andPostRollPicUrlGreaterThan(String value) {
            addCriterion("post_roll_pic_url >", value, "postRollPicUrl");
            return (Criteria) this;
        }

        public Criteria andPostRollPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("post_roll_pic_url >=", value, "postRollPicUrl");
            return (Criteria) this;
        }

        public Criteria andPostRollPicUrlLessThan(String value) {
            addCriterion("post_roll_pic_url <", value, "postRollPicUrl");
            return (Criteria) this;
        }

        public Criteria andPostRollPicUrlLessThanOrEqualTo(String value) {
            addCriterion("post_roll_pic_url <=", value, "postRollPicUrl");
            return (Criteria) this;
        }

        public Criteria andPostRollPicUrlLike(String value) {
            addCriterion("post_roll_pic_url like", value, "postRollPicUrl");
            return (Criteria) this;
        }

        public Criteria andPostRollPicUrlNotLike(String value) {
            addCriterion("post_roll_pic_url not like", value, "postRollPicUrl");
            return (Criteria) this;
        }

        public Criteria andPostRollPicUrlIn(List<String> values) {
            addCriterion("post_roll_pic_url in", values, "postRollPicUrl");
            return (Criteria) this;
        }

        public Criteria andPostRollPicUrlNotIn(List<String> values) {
            addCriterion("post_roll_pic_url not in", values, "postRollPicUrl");
            return (Criteria) this;
        }

        public Criteria andPostRollPicUrlBetween(String value1, String value2) {
            addCriterion("post_roll_pic_url between", value1, value2, "postRollPicUrl");
            return (Criteria) this;
        }

        public Criteria andPostRollPicUrlNotBetween(String value1, String value2) {
            addCriterion("post_roll_pic_url not between", value1, value2, "postRollPicUrl");
            return (Criteria) this;
        }

        public Criteria andPostRollPicAddressIsNull() {
            addCriterion("post_roll_pic_address is null");
            return (Criteria) this;
        }

        public Criteria andPostRollPicAddressIsNotNull() {
            addCriterion("post_roll_pic_address is not null");
            return (Criteria) this;
        }

        public Criteria andPostRollPicAddressEqualTo(String value) {
            addCriterion("post_roll_pic_address =", value, "postRollPicAddress");
            return (Criteria) this;
        }

        public Criteria andPostRollPicAddressNotEqualTo(String value) {
            addCriterion("post_roll_pic_address <>", value, "postRollPicAddress");
            return (Criteria) this;
        }

        public Criteria andPostRollPicAddressGreaterThan(String value) {
            addCriterion("post_roll_pic_address >", value, "postRollPicAddress");
            return (Criteria) this;
        }

        public Criteria andPostRollPicAddressGreaterThanOrEqualTo(String value) {
            addCriterion("post_roll_pic_address >=", value, "postRollPicAddress");
            return (Criteria) this;
        }

        public Criteria andPostRollPicAddressLessThan(String value) {
            addCriterion("post_roll_pic_address <", value, "postRollPicAddress");
            return (Criteria) this;
        }

        public Criteria andPostRollPicAddressLessThanOrEqualTo(String value) {
            addCriterion("post_roll_pic_address <=", value, "postRollPicAddress");
            return (Criteria) this;
        }

        public Criteria andPostRollPicAddressLike(String value) {
            addCriterion("post_roll_pic_address like", value, "postRollPicAddress");
            return (Criteria) this;
        }

        public Criteria andPostRollPicAddressNotLike(String value) {
            addCriterion("post_roll_pic_address not like", value, "postRollPicAddress");
            return (Criteria) this;
        }

        public Criteria andPostRollPicAddressIn(List<String> values) {
            addCriterion("post_roll_pic_address in", values, "postRollPicAddress");
            return (Criteria) this;
        }

        public Criteria andPostRollPicAddressNotIn(List<String> values) {
            addCriterion("post_roll_pic_address not in", values, "postRollPicAddress");
            return (Criteria) this;
        }

        public Criteria andPostRollPicAddressBetween(String value1, String value2) {
            addCriterion("post_roll_pic_address between", value1, value2, "postRollPicAddress");
            return (Criteria) this;
        }

        public Criteria andPostRollPicAddressNotBetween(String value1, String value2) {
            addCriterion("post_roll_pic_address not between", value1, value2, "postRollPicAddress");
            return (Criteria) this;
        }

        public Criteria andPostRollPicNoteIsNull() {
            addCriterion("post_roll_pic_note is null");
            return (Criteria) this;
        }

        public Criteria andPostRollPicNoteIsNotNull() {
            addCriterion("post_roll_pic_note is not null");
            return (Criteria) this;
        }

        public Criteria andPostRollPicNoteEqualTo(String value) {
            addCriterion("post_roll_pic_note =", value, "postRollPicNote");
            return (Criteria) this;
        }

        public Criteria andPostRollPicNoteNotEqualTo(String value) {
            addCriterion("post_roll_pic_note <>", value, "postRollPicNote");
            return (Criteria) this;
        }

        public Criteria andPostRollPicNoteGreaterThan(String value) {
            addCriterion("post_roll_pic_note >", value, "postRollPicNote");
            return (Criteria) this;
        }

        public Criteria andPostRollPicNoteGreaterThanOrEqualTo(String value) {
            addCriterion("post_roll_pic_note >=", value, "postRollPicNote");
            return (Criteria) this;
        }

        public Criteria andPostRollPicNoteLessThan(String value) {
            addCriterion("post_roll_pic_note <", value, "postRollPicNote");
            return (Criteria) this;
        }

        public Criteria andPostRollPicNoteLessThanOrEqualTo(String value) {
            addCriterion("post_roll_pic_note <=", value, "postRollPicNote");
            return (Criteria) this;
        }

        public Criteria andPostRollPicNoteLike(String value) {
            addCriterion("post_roll_pic_note like", value, "postRollPicNote");
            return (Criteria) this;
        }

        public Criteria andPostRollPicNoteNotLike(String value) {
            addCriterion("post_roll_pic_note not like", value, "postRollPicNote");
            return (Criteria) this;
        }

        public Criteria andPostRollPicNoteIn(List<String> values) {
            addCriterion("post_roll_pic_note in", values, "postRollPicNote");
            return (Criteria) this;
        }

        public Criteria andPostRollPicNoteNotIn(List<String> values) {
            addCriterion("post_roll_pic_note not in", values, "postRollPicNote");
            return (Criteria) this;
        }

        public Criteria andPostRollPicNoteBetween(String value1, String value2) {
            addCriterion("post_roll_pic_note between", value1, value2, "postRollPicNote");
            return (Criteria) this;
        }

        public Criteria andPostRollPicNoteNotBetween(String value1, String value2) {
            addCriterion("post_roll_pic_note not between", value1, value2, "postRollPicNote");
            return (Criteria) this;
        }

        public Criteria andPostRollPicSpeakIsNull() {
            addCriterion("post_roll_pic_speak is null");
            return (Criteria) this;
        }

        public Criteria andPostRollPicSpeakIsNotNull() {
            addCriterion("post_roll_pic_speak is not null");
            return (Criteria) this;
        }

        public Criteria andPostRollPicSpeakEqualTo(String value) {
            addCriterion("post_roll_pic_speak =", value, "postRollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andPostRollPicSpeakNotEqualTo(String value) {
            addCriterion("post_roll_pic_speak <>", value, "postRollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andPostRollPicSpeakGreaterThan(String value) {
            addCriterion("post_roll_pic_speak >", value, "postRollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andPostRollPicSpeakGreaterThanOrEqualTo(String value) {
            addCriterion("post_roll_pic_speak >=", value, "postRollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andPostRollPicSpeakLessThan(String value) {
            addCriterion("post_roll_pic_speak <", value, "postRollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andPostRollPicSpeakLessThanOrEqualTo(String value) {
            addCriterion("post_roll_pic_speak <=", value, "postRollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andPostRollPicSpeakLike(String value) {
            addCriterion("post_roll_pic_speak like", value, "postRollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andPostRollPicSpeakNotLike(String value) {
            addCriterion("post_roll_pic_speak not like", value, "postRollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andPostRollPicSpeakIn(List<String> values) {
            addCriterion("post_roll_pic_speak in", values, "postRollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andPostRollPicSpeakNotIn(List<String> values) {
            addCriterion("post_roll_pic_speak not in", values, "postRollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andPostRollPicSpeakBetween(String value1, String value2) {
            addCriterion("post_roll_pic_speak between", value1, value2, "postRollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andPostRollPicSpeakNotBetween(String value1, String value2) {
            addCriterion("post_roll_pic_speak not between", value1, value2, "postRollPicSpeak");
            return (Criteria) this;
        }

        public Criteria andPostRollPicRankIsNull() {
            addCriterion("post_roll_pic_rank is null");
            return (Criteria) this;
        }

        public Criteria andPostRollPicRankIsNotNull() {
            addCriterion("post_roll_pic_rank is not null");
            return (Criteria) this;
        }

        public Criteria andPostRollPicRankEqualTo(String value) {
            addCriterion("post_roll_pic_rank =", value, "postRollPicRank");
            return (Criteria) this;
        }

        public Criteria andPostRollPicRankNotEqualTo(String value) {
            addCriterion("post_roll_pic_rank <>", value, "postRollPicRank");
            return (Criteria) this;
        }

        public Criteria andPostRollPicRankGreaterThan(String value) {
            addCriterion("post_roll_pic_rank >", value, "postRollPicRank");
            return (Criteria) this;
        }

        public Criteria andPostRollPicRankGreaterThanOrEqualTo(String value) {
            addCriterion("post_roll_pic_rank >=", value, "postRollPicRank");
            return (Criteria) this;
        }

        public Criteria andPostRollPicRankLessThan(String value) {
            addCriterion("post_roll_pic_rank <", value, "postRollPicRank");
            return (Criteria) this;
        }

        public Criteria andPostRollPicRankLessThanOrEqualTo(String value) {
            addCriterion("post_roll_pic_rank <=", value, "postRollPicRank");
            return (Criteria) this;
        }

        public Criteria andPostRollPicRankLike(String value) {
            addCriterion("post_roll_pic_rank like", value, "postRollPicRank");
            return (Criteria) this;
        }

        public Criteria andPostRollPicRankNotLike(String value) {
            addCriterion("post_roll_pic_rank not like", value, "postRollPicRank");
            return (Criteria) this;
        }

        public Criteria andPostRollPicRankIn(List<String> values) {
            addCriterion("post_roll_pic_rank in", values, "postRollPicRank");
            return (Criteria) this;
        }

        public Criteria andPostRollPicRankNotIn(List<String> values) {
            addCriterion("post_roll_pic_rank not in", values, "postRollPicRank");
            return (Criteria) this;
        }

        public Criteria andPostRollPicRankBetween(String value1, String value2) {
            addCriterion("post_roll_pic_rank between", value1, value2, "postRollPicRank");
            return (Criteria) this;
        }

        public Criteria andPostRollPicRankNotBetween(String value1, String value2) {
            addCriterion("post_roll_pic_rank not between", value1, value2, "postRollPicRank");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreaterIsNull() {
            addCriterion("post_roll_pic_creater is null");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreaterIsNotNull() {
            addCriterion("post_roll_pic_creater is not null");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreaterEqualTo(String value) {
            addCriterion("post_roll_pic_creater =", value, "postRollPicCreater");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreaterNotEqualTo(String value) {
            addCriterion("post_roll_pic_creater <>", value, "postRollPicCreater");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreaterGreaterThan(String value) {
            addCriterion("post_roll_pic_creater >", value, "postRollPicCreater");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("post_roll_pic_creater >=", value, "postRollPicCreater");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreaterLessThan(String value) {
            addCriterion("post_roll_pic_creater <", value, "postRollPicCreater");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreaterLessThanOrEqualTo(String value) {
            addCriterion("post_roll_pic_creater <=", value, "postRollPicCreater");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreaterLike(String value) {
            addCriterion("post_roll_pic_creater like", value, "postRollPicCreater");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreaterNotLike(String value) {
            addCriterion("post_roll_pic_creater not like", value, "postRollPicCreater");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreaterIn(List<String> values) {
            addCriterion("post_roll_pic_creater in", values, "postRollPicCreater");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreaterNotIn(List<String> values) {
            addCriterion("post_roll_pic_creater not in", values, "postRollPicCreater");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreaterBetween(String value1, String value2) {
            addCriterion("post_roll_pic_creater between", value1, value2, "postRollPicCreater");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreaterNotBetween(String value1, String value2) {
            addCriterion("post_roll_pic_creater not between", value1, value2, "postRollPicCreater");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreatetimeIsNull() {
            addCriterion("post_roll_pic_createtime is null");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreatetimeIsNotNull() {
            addCriterion("post_roll_pic_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreatetimeEqualTo(Date value) {
            addCriterion("post_roll_pic_createtime =", value, "postRollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreatetimeNotEqualTo(Date value) {
            addCriterion("post_roll_pic_createtime <>", value, "postRollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreatetimeGreaterThan(Date value) {
            addCriterion("post_roll_pic_createtime >", value, "postRollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("post_roll_pic_createtime >=", value, "postRollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreatetimeLessThan(Date value) {
            addCriterion("post_roll_pic_createtime <", value, "postRollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("post_roll_pic_createtime <=", value, "postRollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreatetimeIn(List<Date> values) {
            addCriterion("post_roll_pic_createtime in", values, "postRollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreatetimeNotIn(List<Date> values) {
            addCriterion("post_roll_pic_createtime not in", values, "postRollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreatetimeBetween(Date value1, Date value2) {
            addCriterion("post_roll_pic_createtime between", value1, value2, "postRollPicCreatetime");
            return (Criteria) this;
        }

        public Criteria andPostRollPicCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("post_roll_pic_createtime not between", value1, value2, "postRollPicCreatetime");
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