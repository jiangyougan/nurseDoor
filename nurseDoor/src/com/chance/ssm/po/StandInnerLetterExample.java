package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StandInnerLetterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StandInnerLetterExample() {
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

        public Criteria andStandInnerLetterIdIsNull() {
            addCriterion("stand_inner_letter_id is null");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterIdIsNotNull() {
            addCriterion("stand_inner_letter_id is not null");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterIdEqualTo(String value) {
            addCriterion("stand_inner_letter_id =", value, "standInnerLetterId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterIdNotEqualTo(String value) {
            addCriterion("stand_inner_letter_id <>", value, "standInnerLetterId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterIdGreaterThan(String value) {
            addCriterion("stand_inner_letter_id >", value, "standInnerLetterId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterIdGreaterThanOrEqualTo(String value) {
            addCriterion("stand_inner_letter_id >=", value, "standInnerLetterId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterIdLessThan(String value) {
            addCriterion("stand_inner_letter_id <", value, "standInnerLetterId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterIdLessThanOrEqualTo(String value) {
            addCriterion("stand_inner_letter_id <=", value, "standInnerLetterId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterIdLike(String value) {
            addCriterion("stand_inner_letter_id like", value, "standInnerLetterId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterIdNotLike(String value) {
            addCriterion("stand_inner_letter_id not like", value, "standInnerLetterId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterIdIn(List<String> values) {
            addCriterion("stand_inner_letter_id in", values, "standInnerLetterId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterIdNotIn(List<String> values) {
            addCriterion("stand_inner_letter_id not in", values, "standInnerLetterId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterIdBetween(String value1, String value2) {
            addCriterion("stand_inner_letter_id between", value1, value2, "standInnerLetterId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterIdNotBetween(String value1, String value2) {
            addCriterion("stand_inner_letter_id not between", value1, value2, "standInnerLetterId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdIsNull() {
            addCriterion("stand_inner_letter_user_id is null");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdIsNotNull() {
            addCriterion("stand_inner_letter_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdEqualTo(String value) {
            addCriterion("stand_inner_letter_user_id =", value, "standInnerLetterUserId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdNotEqualTo(String value) {
            addCriterion("stand_inner_letter_user_id <>", value, "standInnerLetterUserId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdGreaterThan(String value) {
            addCriterion("stand_inner_letter_user_id >", value, "standInnerLetterUserId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("stand_inner_letter_user_id >=", value, "standInnerLetterUserId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdLessThan(String value) {
            addCriterion("stand_inner_letter_user_id <", value, "standInnerLetterUserId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdLessThanOrEqualTo(String value) {
            addCriterion("stand_inner_letter_user_id <=", value, "standInnerLetterUserId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdLike(String value) {
            addCriterion("stand_inner_letter_user_id like", value, "standInnerLetterUserId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdNotLike(String value) {
            addCriterion("stand_inner_letter_user_id not like", value, "standInnerLetterUserId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdIn(List<String> values) {
            addCriterion("stand_inner_letter_user_id in", values, "standInnerLetterUserId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdNotIn(List<String> values) {
            addCriterion("stand_inner_letter_user_id not in", values, "standInnerLetterUserId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdBetween(String value1, String value2) {
            addCriterion("stand_inner_letter_user_id between", value1, value2, "standInnerLetterUserId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdNotBetween(String value1, String value2) {
            addCriterion("stand_inner_letter_user_id not between", value1, value2, "standInnerLetterUserId");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdentityIsNull() {
            addCriterion("stand_inner_letter_user_identity is null");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdentityIsNotNull() {
            addCriterion("stand_inner_letter_user_identity is not null");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdentityEqualTo(Integer value) {
            addCriterion("stand_inner_letter_user_identity =", value, "standInnerLetterUserIdentity");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdentityNotEqualTo(Integer value) {
            addCriterion("stand_inner_letter_user_identity <>", value, "standInnerLetterUserIdentity");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdentityGreaterThan(Integer value) {
            addCriterion("stand_inner_letter_user_identity >", value, "standInnerLetterUserIdentity");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdentityGreaterThanOrEqualTo(Integer value) {
            addCriterion("stand_inner_letter_user_identity >=", value, "standInnerLetterUserIdentity");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdentityLessThan(Integer value) {
            addCriterion("stand_inner_letter_user_identity <", value, "standInnerLetterUserIdentity");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdentityLessThanOrEqualTo(Integer value) {
            addCriterion("stand_inner_letter_user_identity <=", value, "standInnerLetterUserIdentity");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdentityIn(List<Integer> values) {
            addCriterion("stand_inner_letter_user_identity in", values, "standInnerLetterUserIdentity");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdentityNotIn(List<Integer> values) {
            addCriterion("stand_inner_letter_user_identity not in", values, "standInnerLetterUserIdentity");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdentityBetween(Integer value1, Integer value2) {
            addCriterion("stand_inner_letter_user_identity between", value1, value2, "standInnerLetterUserIdentity");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserIdentityNotBetween(Integer value1, Integer value2) {
            addCriterion("stand_inner_letter_user_identity not between", value1, value2, "standInnerLetterUserIdentity");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserTypeIsNull() {
            addCriterion("stand_inner_letter_user_type is null");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserTypeIsNotNull() {
            addCriterion("stand_inner_letter_user_type is not null");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserTypeEqualTo(Integer value) {
            addCriterion("stand_inner_letter_user_type =", value, "standInnerLetterUserType");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserTypeNotEqualTo(Integer value) {
            addCriterion("stand_inner_letter_user_type <>", value, "standInnerLetterUserType");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserTypeGreaterThan(Integer value) {
            addCriterion("stand_inner_letter_user_type >", value, "standInnerLetterUserType");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stand_inner_letter_user_type >=", value, "standInnerLetterUserType");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserTypeLessThan(Integer value) {
            addCriterion("stand_inner_letter_user_type <", value, "standInnerLetterUserType");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("stand_inner_letter_user_type <=", value, "standInnerLetterUserType");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserTypeIn(List<Integer> values) {
            addCriterion("stand_inner_letter_user_type in", values, "standInnerLetterUserType");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserTypeNotIn(List<Integer> values) {
            addCriterion("stand_inner_letter_user_type not in", values, "standInnerLetterUserType");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("stand_inner_letter_user_type between", value1, value2, "standInnerLetterUserType");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("stand_inner_letter_user_type not between", value1, value2, "standInnerLetterUserType");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterTitleIsNull() {
            addCriterion("stand_inner_letter_title is null");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterTitleIsNotNull() {
            addCriterion("stand_inner_letter_title is not null");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterTitleEqualTo(String value) {
            addCriterion("stand_inner_letter_title =", value, "standInnerLetterTitle");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterTitleNotEqualTo(String value) {
            addCriterion("stand_inner_letter_title <>", value, "standInnerLetterTitle");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterTitleGreaterThan(String value) {
            addCriterion("stand_inner_letter_title >", value, "standInnerLetterTitle");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterTitleGreaterThanOrEqualTo(String value) {
            addCriterion("stand_inner_letter_title >=", value, "standInnerLetterTitle");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterTitleLessThan(String value) {
            addCriterion("stand_inner_letter_title <", value, "standInnerLetterTitle");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterTitleLessThanOrEqualTo(String value) {
            addCriterion("stand_inner_letter_title <=", value, "standInnerLetterTitle");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterTitleLike(String value) {
            addCriterion("stand_inner_letter_title like", value, "standInnerLetterTitle");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterTitleNotLike(String value) {
            addCriterion("stand_inner_letter_title not like", value, "standInnerLetterTitle");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterTitleIn(List<String> values) {
            addCriterion("stand_inner_letter_title in", values, "standInnerLetterTitle");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterTitleNotIn(List<String> values) {
            addCriterion("stand_inner_letter_title not in", values, "standInnerLetterTitle");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterTitleBetween(String value1, String value2) {
            addCriterion("stand_inner_letter_title between", value1, value2, "standInnerLetterTitle");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterTitleNotBetween(String value1, String value2) {
            addCriterion("stand_inner_letter_title not between", value1, value2, "standInnerLetterTitle");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterNoteIsNull() {
            addCriterion("stand_inner_letter_note is null");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterNoteIsNotNull() {
            addCriterion("stand_inner_letter_note is not null");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterNoteEqualTo(String value) {
            addCriterion("stand_inner_letter_note =", value, "standInnerLetterNote");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterNoteNotEqualTo(String value) {
            addCriterion("stand_inner_letter_note <>", value, "standInnerLetterNote");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterNoteGreaterThan(String value) {
            addCriterion("stand_inner_letter_note >", value, "standInnerLetterNote");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterNoteGreaterThanOrEqualTo(String value) {
            addCriterion("stand_inner_letter_note >=", value, "standInnerLetterNote");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterNoteLessThan(String value) {
            addCriterion("stand_inner_letter_note <", value, "standInnerLetterNote");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterNoteLessThanOrEqualTo(String value) {
            addCriterion("stand_inner_letter_note <=", value, "standInnerLetterNote");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterNoteLike(String value) {
            addCriterion("stand_inner_letter_note like", value, "standInnerLetterNote");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterNoteNotLike(String value) {
            addCriterion("stand_inner_letter_note not like", value, "standInnerLetterNote");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterNoteIn(List<String> values) {
            addCriterion("stand_inner_letter_note in", values, "standInnerLetterNote");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterNoteNotIn(List<String> values) {
            addCriterion("stand_inner_letter_note not in", values, "standInnerLetterNote");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterNoteBetween(String value1, String value2) {
            addCriterion("stand_inner_letter_note between", value1, value2, "standInnerLetterNote");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterNoteNotBetween(String value1, String value2) {
            addCriterion("stand_inner_letter_note not between", value1, value2, "standInnerLetterNote");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterContentIsNull() {
            addCriterion("stand_inner_letter_content is null");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterContentIsNotNull() {
            addCriterion("stand_inner_letter_content is not null");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterContentEqualTo(String value) {
            addCriterion("stand_inner_letter_content =", value, "standInnerLetterContent");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterContentNotEqualTo(String value) {
            addCriterion("stand_inner_letter_content <>", value, "standInnerLetterContent");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterContentGreaterThan(String value) {
            addCriterion("stand_inner_letter_content >", value, "standInnerLetterContent");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterContentGreaterThanOrEqualTo(String value) {
            addCriterion("stand_inner_letter_content >=", value, "standInnerLetterContent");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterContentLessThan(String value) {
            addCriterion("stand_inner_letter_content <", value, "standInnerLetterContent");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterContentLessThanOrEqualTo(String value) {
            addCriterion("stand_inner_letter_content <=", value, "standInnerLetterContent");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterContentLike(String value) {
            addCriterion("stand_inner_letter_content like", value, "standInnerLetterContent");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterContentNotLike(String value) {
            addCriterion("stand_inner_letter_content not like", value, "standInnerLetterContent");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterContentIn(List<String> values) {
            addCriterion("stand_inner_letter_content in", values, "standInnerLetterContent");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterContentNotIn(List<String> values) {
            addCriterion("stand_inner_letter_content not in", values, "standInnerLetterContent");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterContentBetween(String value1, String value2) {
            addCriterion("stand_inner_letter_content between", value1, value2, "standInnerLetterContent");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterContentNotBetween(String value1, String value2) {
            addCriterion("stand_inner_letter_content not between", value1, value2, "standInnerLetterContent");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterCreatetimeIsNull() {
            addCriterion("stand_inner_letter_createtime is null");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterCreatetimeIsNotNull() {
            addCriterion("stand_inner_letter_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterCreatetimeEqualTo(Date value) {
            addCriterion("stand_inner_letter_createtime =", value, "standInnerLetterCreatetime");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterCreatetimeNotEqualTo(Date value) {
            addCriterion("stand_inner_letter_createtime <>", value, "standInnerLetterCreatetime");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterCreatetimeGreaterThan(Date value) {
            addCriterion("stand_inner_letter_createtime >", value, "standInnerLetterCreatetime");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stand_inner_letter_createtime >=", value, "standInnerLetterCreatetime");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterCreatetimeLessThan(Date value) {
            addCriterion("stand_inner_letter_createtime <", value, "standInnerLetterCreatetime");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("stand_inner_letter_createtime <=", value, "standInnerLetterCreatetime");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterCreatetimeIn(List<Date> values) {
            addCriterion("stand_inner_letter_createtime in", values, "standInnerLetterCreatetime");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterCreatetimeNotIn(List<Date> values) {
            addCriterion("stand_inner_letter_createtime not in", values, "standInnerLetterCreatetime");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterCreatetimeBetween(Date value1, Date value2) {
            addCriterion("stand_inner_letter_createtime between", value1, value2, "standInnerLetterCreatetime");
            return (Criteria) this;
        }

        public Criteria andStandInnerLetterCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("stand_inner_letter_createtime not between", value1, value2, "standInnerLetterCreatetime");
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