package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodServiceRecommendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodServiceRecommendExample() {
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

        public Criteria andGoodServiceRecommendIdIsNull() {
            addCriterion("good_service_recommend_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendIdIsNotNull() {
            addCriterion("good_service_recommend_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendIdEqualTo(String value) {
            addCriterion("good_service_recommend_id =", value, "goodServiceRecommendId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendIdNotEqualTo(String value) {
            addCriterion("good_service_recommend_id <>", value, "goodServiceRecommendId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendIdGreaterThan(String value) {
            addCriterion("good_service_recommend_id >", value, "goodServiceRecommendId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendIdGreaterThanOrEqualTo(String value) {
            addCriterion("good_service_recommend_id >=", value, "goodServiceRecommendId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendIdLessThan(String value) {
            addCriterion("good_service_recommend_id <", value, "goodServiceRecommendId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendIdLessThanOrEqualTo(String value) {
            addCriterion("good_service_recommend_id <=", value, "goodServiceRecommendId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendIdLike(String value) {
            addCriterion("good_service_recommend_id like", value, "goodServiceRecommendId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendIdNotLike(String value) {
            addCriterion("good_service_recommend_id not like", value, "goodServiceRecommendId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendIdIn(List<String> values) {
            addCriterion("good_service_recommend_id in", values, "goodServiceRecommendId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendIdNotIn(List<String> values) {
            addCriterion("good_service_recommend_id not in", values, "goodServiceRecommendId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendIdBetween(String value1, String value2) {
            addCriterion("good_service_recommend_id between", value1, value2, "goodServiceRecommendId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendIdNotBetween(String value1, String value2) {
            addCriterion("good_service_recommend_id not between", value1, value2, "goodServiceRecommendId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentIdIsNull() {
            addCriterion("good_service_recommend_content_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentIdIsNotNull() {
            addCriterion("good_service_recommend_content_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentIdEqualTo(String value) {
            addCriterion("good_service_recommend_content_id =", value, "goodServiceRecommendContentId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentIdNotEqualTo(String value) {
            addCriterion("good_service_recommend_content_id <>", value, "goodServiceRecommendContentId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentIdGreaterThan(String value) {
            addCriterion("good_service_recommend_content_id >", value, "goodServiceRecommendContentId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentIdGreaterThanOrEqualTo(String value) {
            addCriterion("good_service_recommend_content_id >=", value, "goodServiceRecommendContentId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentIdLessThan(String value) {
            addCriterion("good_service_recommend_content_id <", value, "goodServiceRecommendContentId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentIdLessThanOrEqualTo(String value) {
            addCriterion("good_service_recommend_content_id <=", value, "goodServiceRecommendContentId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentIdLike(String value) {
            addCriterion("good_service_recommend_content_id like", value, "goodServiceRecommendContentId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentIdNotLike(String value) {
            addCriterion("good_service_recommend_content_id not like", value, "goodServiceRecommendContentId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentIdIn(List<String> values) {
            addCriterion("good_service_recommend_content_id in", values, "goodServiceRecommendContentId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentIdNotIn(List<String> values) {
            addCriterion("good_service_recommend_content_id not in", values, "goodServiceRecommendContentId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentIdBetween(String value1, String value2) {
            addCriterion("good_service_recommend_content_id between", value1, value2, "goodServiceRecommendContentId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentIdNotBetween(String value1, String value2) {
            addCriterion("good_service_recommend_content_id not between", value1, value2, "goodServiceRecommendContentId");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentPicIsNull() {
            addCriterion("good_service_recommend_content_pic is null");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentPicIsNotNull() {
            addCriterion("good_service_recommend_content_pic is not null");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentPicEqualTo(String value) {
            addCriterion("good_service_recommend_content_pic =", value, "goodServiceRecommendContentPic");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentPicNotEqualTo(String value) {
            addCriterion("good_service_recommend_content_pic <>", value, "goodServiceRecommendContentPic");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentPicGreaterThan(String value) {
            addCriterion("good_service_recommend_content_pic >", value, "goodServiceRecommendContentPic");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentPicGreaterThanOrEqualTo(String value) {
            addCriterion("good_service_recommend_content_pic >=", value, "goodServiceRecommendContentPic");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentPicLessThan(String value) {
            addCriterion("good_service_recommend_content_pic <", value, "goodServiceRecommendContentPic");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentPicLessThanOrEqualTo(String value) {
            addCriterion("good_service_recommend_content_pic <=", value, "goodServiceRecommendContentPic");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentPicLike(String value) {
            addCriterion("good_service_recommend_content_pic like", value, "goodServiceRecommendContentPic");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentPicNotLike(String value) {
            addCriterion("good_service_recommend_content_pic not like", value, "goodServiceRecommendContentPic");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentPicIn(List<String> values) {
            addCriterion("good_service_recommend_content_pic in", values, "goodServiceRecommendContentPic");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentPicNotIn(List<String> values) {
            addCriterion("good_service_recommend_content_pic not in", values, "goodServiceRecommendContentPic");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentPicBetween(String value1, String value2) {
            addCriterion("good_service_recommend_content_pic between", value1, value2, "goodServiceRecommendContentPic");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendContentPicNotBetween(String value1, String value2) {
            addCriterion("good_service_recommend_content_pic not between", value1, value2, "goodServiceRecommendContentPic");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendNoteIsNull() {
            addCriterion("good_service_recommend_note is null");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendNoteIsNotNull() {
            addCriterion("good_service_recommend_note is not null");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendNoteEqualTo(String value) {
            addCriterion("good_service_recommend_note =", value, "goodServiceRecommendNote");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendNoteNotEqualTo(String value) {
            addCriterion("good_service_recommend_note <>", value, "goodServiceRecommendNote");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendNoteGreaterThan(String value) {
            addCriterion("good_service_recommend_note >", value, "goodServiceRecommendNote");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendNoteGreaterThanOrEqualTo(String value) {
            addCriterion("good_service_recommend_note >=", value, "goodServiceRecommendNote");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendNoteLessThan(String value) {
            addCriterion("good_service_recommend_note <", value, "goodServiceRecommendNote");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendNoteLessThanOrEqualTo(String value) {
            addCriterion("good_service_recommend_note <=", value, "goodServiceRecommendNote");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendNoteLike(String value) {
            addCriterion("good_service_recommend_note like", value, "goodServiceRecommendNote");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendNoteNotLike(String value) {
            addCriterion("good_service_recommend_note not like", value, "goodServiceRecommendNote");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendNoteIn(List<String> values) {
            addCriterion("good_service_recommend_note in", values, "goodServiceRecommendNote");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendNoteNotIn(List<String> values) {
            addCriterion("good_service_recommend_note not in", values, "goodServiceRecommendNote");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendNoteBetween(String value1, String value2) {
            addCriterion("good_service_recommend_note between", value1, value2, "goodServiceRecommendNote");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendNoteNotBetween(String value1, String value2) {
            addCriterion("good_service_recommend_note not between", value1, value2, "goodServiceRecommendNote");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendSpeakIsNull() {
            addCriterion("good_service_recommend_speak is null");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendSpeakIsNotNull() {
            addCriterion("good_service_recommend_speak is not null");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendSpeakEqualTo(String value) {
            addCriterion("good_service_recommend_speak =", value, "goodServiceRecommendSpeak");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendSpeakNotEqualTo(String value) {
            addCriterion("good_service_recommend_speak <>", value, "goodServiceRecommendSpeak");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendSpeakGreaterThan(String value) {
            addCriterion("good_service_recommend_speak >", value, "goodServiceRecommendSpeak");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendSpeakGreaterThanOrEqualTo(String value) {
            addCriterion("good_service_recommend_speak >=", value, "goodServiceRecommendSpeak");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendSpeakLessThan(String value) {
            addCriterion("good_service_recommend_speak <", value, "goodServiceRecommendSpeak");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendSpeakLessThanOrEqualTo(String value) {
            addCriterion("good_service_recommend_speak <=", value, "goodServiceRecommendSpeak");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendSpeakLike(String value) {
            addCriterion("good_service_recommend_speak like", value, "goodServiceRecommendSpeak");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendSpeakNotLike(String value) {
            addCriterion("good_service_recommend_speak not like", value, "goodServiceRecommendSpeak");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendSpeakIn(List<String> values) {
            addCriterion("good_service_recommend_speak in", values, "goodServiceRecommendSpeak");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendSpeakNotIn(List<String> values) {
            addCriterion("good_service_recommend_speak not in", values, "goodServiceRecommendSpeak");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendSpeakBetween(String value1, String value2) {
            addCriterion("good_service_recommend_speak between", value1, value2, "goodServiceRecommendSpeak");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendSpeakNotBetween(String value1, String value2) {
            addCriterion("good_service_recommend_speak not between", value1, value2, "goodServiceRecommendSpeak");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreateterIsNull() {
            addCriterion("good_service_recommend_createter is null");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreateterIsNotNull() {
            addCriterion("good_service_recommend_createter is not null");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreateterEqualTo(String value) {
            addCriterion("good_service_recommend_createter =", value, "goodServiceRecommendCreateter");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreateterNotEqualTo(String value) {
            addCriterion("good_service_recommend_createter <>", value, "goodServiceRecommendCreateter");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreateterGreaterThan(String value) {
            addCriterion("good_service_recommend_createter >", value, "goodServiceRecommendCreateter");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreateterGreaterThanOrEqualTo(String value) {
            addCriterion("good_service_recommend_createter >=", value, "goodServiceRecommendCreateter");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreateterLessThan(String value) {
            addCriterion("good_service_recommend_createter <", value, "goodServiceRecommendCreateter");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreateterLessThanOrEqualTo(String value) {
            addCriterion("good_service_recommend_createter <=", value, "goodServiceRecommendCreateter");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreateterLike(String value) {
            addCriterion("good_service_recommend_createter like", value, "goodServiceRecommendCreateter");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreateterNotLike(String value) {
            addCriterion("good_service_recommend_createter not like", value, "goodServiceRecommendCreateter");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreateterIn(List<String> values) {
            addCriterion("good_service_recommend_createter in", values, "goodServiceRecommendCreateter");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreateterNotIn(List<String> values) {
            addCriterion("good_service_recommend_createter not in", values, "goodServiceRecommendCreateter");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreateterBetween(String value1, String value2) {
            addCriterion("good_service_recommend_createter between", value1, value2, "goodServiceRecommendCreateter");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreateterNotBetween(String value1, String value2) {
            addCriterion("good_service_recommend_createter not between", value1, value2, "goodServiceRecommendCreateter");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreatetimeIsNull() {
            addCriterion("good_service_recommend_createtime is null");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreatetimeIsNotNull() {
            addCriterion("good_service_recommend_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreatetimeEqualTo(Date value) {
            addCriterion("good_service_recommend_createtime =", value, "goodServiceRecommendCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreatetimeNotEqualTo(Date value) {
            addCriterion("good_service_recommend_createtime <>", value, "goodServiceRecommendCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreatetimeGreaterThan(Date value) {
            addCriterion("good_service_recommend_createtime >", value, "goodServiceRecommendCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("good_service_recommend_createtime >=", value, "goodServiceRecommendCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreatetimeLessThan(Date value) {
            addCriterion("good_service_recommend_createtime <", value, "goodServiceRecommendCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("good_service_recommend_createtime <=", value, "goodServiceRecommendCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreatetimeIn(List<Date> values) {
            addCriterion("good_service_recommend_createtime in", values, "goodServiceRecommendCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreatetimeNotIn(List<Date> values) {
            addCriterion("good_service_recommend_createtime not in", values, "goodServiceRecommendCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreatetimeBetween(Date value1, Date value2) {
            addCriterion("good_service_recommend_createtime between", value1, value2, "goodServiceRecommendCreatetime");
            return (Criteria) this;
        }

        public Criteria andGoodServiceRecommendCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("good_service_recommend_createtime not between", value1, value2, "goodServiceRecommendCreatetime");
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