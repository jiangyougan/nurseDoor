package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvitationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvitationExample() {
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

        public Criteria andInvitationIdIsNull() {
            addCriterion("invitation_id is null");
            return (Criteria) this;
        }

        public Criteria andInvitationIdIsNotNull() {
            addCriterion("invitation_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationIdEqualTo(String value) {
            addCriterion("invitation_id =", value, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdNotEqualTo(String value) {
            addCriterion("invitation_id <>", value, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdGreaterThan(String value) {
            addCriterion("invitation_id >", value, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdGreaterThanOrEqualTo(String value) {
            addCriterion("invitation_id >=", value, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdLessThan(String value) {
            addCriterion("invitation_id <", value, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdLessThanOrEqualTo(String value) {
            addCriterion("invitation_id <=", value, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdLike(String value) {
            addCriterion("invitation_id like", value, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdNotLike(String value) {
            addCriterion("invitation_id not like", value, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdIn(List<String> values) {
            addCriterion("invitation_id in", values, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdNotIn(List<String> values) {
            addCriterion("invitation_id not in", values, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdBetween(String value1, String value2) {
            addCriterion("invitation_id between", value1, value2, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdNotBetween(String value1, String value2) {
            addCriterion("invitation_id not between", value1, value2, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationUserIdIsNull() {
            addCriterion("invitation_user_id is null");
            return (Criteria) this;
        }

        public Criteria andInvitationUserIdIsNotNull() {
            addCriterion("invitation_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationUserIdEqualTo(String value) {
            addCriterion("invitation_user_id =", value, "invitationUserId");
            return (Criteria) this;
        }

        public Criteria andInvitationUserIdNotEqualTo(String value) {
            addCriterion("invitation_user_id <>", value, "invitationUserId");
            return (Criteria) this;
        }

        public Criteria andInvitationUserIdGreaterThan(String value) {
            addCriterion("invitation_user_id >", value, "invitationUserId");
            return (Criteria) this;
        }

        public Criteria andInvitationUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("invitation_user_id >=", value, "invitationUserId");
            return (Criteria) this;
        }

        public Criteria andInvitationUserIdLessThan(String value) {
            addCriterion("invitation_user_id <", value, "invitationUserId");
            return (Criteria) this;
        }

        public Criteria andInvitationUserIdLessThanOrEqualTo(String value) {
            addCriterion("invitation_user_id <=", value, "invitationUserId");
            return (Criteria) this;
        }

        public Criteria andInvitationUserIdLike(String value) {
            addCriterion("invitation_user_id like", value, "invitationUserId");
            return (Criteria) this;
        }

        public Criteria andInvitationUserIdNotLike(String value) {
            addCriterion("invitation_user_id not like", value, "invitationUserId");
            return (Criteria) this;
        }

        public Criteria andInvitationUserIdIn(List<String> values) {
            addCriterion("invitation_user_id in", values, "invitationUserId");
            return (Criteria) this;
        }

        public Criteria andInvitationUserIdNotIn(List<String> values) {
            addCriterion("invitation_user_id not in", values, "invitationUserId");
            return (Criteria) this;
        }

        public Criteria andInvitationUserIdBetween(String value1, String value2) {
            addCriterion("invitation_user_id between", value1, value2, "invitationUserId");
            return (Criteria) this;
        }

        public Criteria andInvitationUserIdNotBetween(String value1, String value2) {
            addCriterion("invitation_user_id not between", value1, value2, "invitationUserId");
            return (Criteria) this;
        }

        public Criteria andInvitationBeuserIdIsNull() {
            addCriterion("invitation_beuser_id is null");
            return (Criteria) this;
        }

        public Criteria andInvitationBeuserIdIsNotNull() {
            addCriterion("invitation_beuser_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationBeuserIdEqualTo(String value) {
            addCriterion("invitation_beuser_id =", value, "invitationBeuserId");
            return (Criteria) this;
        }

        public Criteria andInvitationBeuserIdNotEqualTo(String value) {
            addCriterion("invitation_beuser_id <>", value, "invitationBeuserId");
            return (Criteria) this;
        }

        public Criteria andInvitationBeuserIdGreaterThan(String value) {
            addCriterion("invitation_beuser_id >", value, "invitationBeuserId");
            return (Criteria) this;
        }

        public Criteria andInvitationBeuserIdGreaterThanOrEqualTo(String value) {
            addCriterion("invitation_beuser_id >=", value, "invitationBeuserId");
            return (Criteria) this;
        }

        public Criteria andInvitationBeuserIdLessThan(String value) {
            addCriterion("invitation_beuser_id <", value, "invitationBeuserId");
            return (Criteria) this;
        }

        public Criteria andInvitationBeuserIdLessThanOrEqualTo(String value) {
            addCriterion("invitation_beuser_id <=", value, "invitationBeuserId");
            return (Criteria) this;
        }

        public Criteria andInvitationBeuserIdLike(String value) {
            addCriterion("invitation_beuser_id like", value, "invitationBeuserId");
            return (Criteria) this;
        }

        public Criteria andInvitationBeuserIdNotLike(String value) {
            addCriterion("invitation_beuser_id not like", value, "invitationBeuserId");
            return (Criteria) this;
        }

        public Criteria andInvitationBeuserIdIn(List<String> values) {
            addCriterion("invitation_beuser_id in", values, "invitationBeuserId");
            return (Criteria) this;
        }

        public Criteria andInvitationBeuserIdNotIn(List<String> values) {
            addCriterion("invitation_beuser_id not in", values, "invitationBeuserId");
            return (Criteria) this;
        }

        public Criteria andInvitationBeuserIdBetween(String value1, String value2) {
            addCriterion("invitation_beuser_id between", value1, value2, "invitationBeuserId");
            return (Criteria) this;
        }

        public Criteria andInvitationBeuserIdNotBetween(String value1, String value2) {
            addCriterion("invitation_beuser_id not between", value1, value2, "invitationBeuserId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdentityIsNull() {
            addCriterion("invitation_identity is null");
            return (Criteria) this;
        }

        public Criteria andInvitationIdentityIsNotNull() {
            addCriterion("invitation_identity is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationIdentityEqualTo(Integer value) {
            addCriterion("invitation_identity =", value, "invitationIdentity");
            return (Criteria) this;
        }

        public Criteria andInvitationIdentityNotEqualTo(Integer value) {
            addCriterion("invitation_identity <>", value, "invitationIdentity");
            return (Criteria) this;
        }

        public Criteria andInvitationIdentityGreaterThan(Integer value) {
            addCriterion("invitation_identity >", value, "invitationIdentity");
            return (Criteria) this;
        }

        public Criteria andInvitationIdentityGreaterThanOrEqualTo(Integer value) {
            addCriterion("invitation_identity >=", value, "invitationIdentity");
            return (Criteria) this;
        }

        public Criteria andInvitationIdentityLessThan(Integer value) {
            addCriterion("invitation_identity <", value, "invitationIdentity");
            return (Criteria) this;
        }

        public Criteria andInvitationIdentityLessThanOrEqualTo(Integer value) {
            addCriterion("invitation_identity <=", value, "invitationIdentity");
            return (Criteria) this;
        }

        public Criteria andInvitationIdentityIn(List<Integer> values) {
            addCriterion("invitation_identity in", values, "invitationIdentity");
            return (Criteria) this;
        }

        public Criteria andInvitationIdentityNotIn(List<Integer> values) {
            addCriterion("invitation_identity not in", values, "invitationIdentity");
            return (Criteria) this;
        }

        public Criteria andInvitationIdentityBetween(Integer value1, Integer value2) {
            addCriterion("invitation_identity between", value1, value2, "invitationIdentity");
            return (Criteria) this;
        }

        public Criteria andInvitationIdentityNotBetween(Integer value1, Integer value2) {
            addCriterion("invitation_identity not between", value1, value2, "invitationIdentity");
            return (Criteria) this;
        }

        public Criteria andInvitationGetmarkIsNull() {
            addCriterion("invitation_getmark is null");
            return (Criteria) this;
        }

        public Criteria andInvitationGetmarkIsNotNull() {
            addCriterion("invitation_getmark is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationGetmarkEqualTo(Integer value) {
            addCriterion("invitation_getmark =", value, "invitationGetmark");
            return (Criteria) this;
        }

        public Criteria andInvitationGetmarkNotEqualTo(Integer value) {
            addCriterion("invitation_getmark <>", value, "invitationGetmark");
            return (Criteria) this;
        }

        public Criteria andInvitationGetmarkGreaterThan(Integer value) {
            addCriterion("invitation_getmark >", value, "invitationGetmark");
            return (Criteria) this;
        }

        public Criteria andInvitationGetmarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("invitation_getmark >=", value, "invitationGetmark");
            return (Criteria) this;
        }

        public Criteria andInvitationGetmarkLessThan(Integer value) {
            addCriterion("invitation_getmark <", value, "invitationGetmark");
            return (Criteria) this;
        }

        public Criteria andInvitationGetmarkLessThanOrEqualTo(Integer value) {
            addCriterion("invitation_getmark <=", value, "invitationGetmark");
            return (Criteria) this;
        }

        public Criteria andInvitationGetmarkIn(List<Integer> values) {
            addCriterion("invitation_getmark in", values, "invitationGetmark");
            return (Criteria) this;
        }

        public Criteria andInvitationGetmarkNotIn(List<Integer> values) {
            addCriterion("invitation_getmark not in", values, "invitationGetmark");
            return (Criteria) this;
        }

        public Criteria andInvitationGetmarkBetween(Integer value1, Integer value2) {
            addCriterion("invitation_getmark between", value1, value2, "invitationGetmark");
            return (Criteria) this;
        }

        public Criteria andInvitationGetmarkNotBetween(Integer value1, Integer value2) {
            addCriterion("invitation_getmark not between", value1, value2, "invitationGetmark");
            return (Criteria) this;
        }

        public Criteria andInvitationCreatetimeIsNull() {
            addCriterion("invitation_createtime is null");
            return (Criteria) this;
        }

        public Criteria andInvitationCreatetimeIsNotNull() {
            addCriterion("invitation_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationCreatetimeEqualTo(Date value) {
            addCriterion("invitation_createtime =", value, "invitationCreatetime");
            return (Criteria) this;
        }

        public Criteria andInvitationCreatetimeNotEqualTo(Date value) {
            addCriterion("invitation_createtime <>", value, "invitationCreatetime");
            return (Criteria) this;
        }

        public Criteria andInvitationCreatetimeGreaterThan(Date value) {
            addCriterion("invitation_createtime >", value, "invitationCreatetime");
            return (Criteria) this;
        }

        public Criteria andInvitationCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("invitation_createtime >=", value, "invitationCreatetime");
            return (Criteria) this;
        }

        public Criteria andInvitationCreatetimeLessThan(Date value) {
            addCriterion("invitation_createtime <", value, "invitationCreatetime");
            return (Criteria) this;
        }

        public Criteria andInvitationCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("invitation_createtime <=", value, "invitationCreatetime");
            return (Criteria) this;
        }

        public Criteria andInvitationCreatetimeIn(List<Date> values) {
            addCriterion("invitation_createtime in", values, "invitationCreatetime");
            return (Criteria) this;
        }

        public Criteria andInvitationCreatetimeNotIn(List<Date> values) {
            addCriterion("invitation_createtime not in", values, "invitationCreatetime");
            return (Criteria) this;
        }

        public Criteria andInvitationCreatetimeBetween(Date value1, Date value2) {
            addCriterion("invitation_createtime between", value1, value2, "invitationCreatetime");
            return (Criteria) this;
        }

        public Criteria andInvitationCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("invitation_createtime not between", value1, value2, "invitationCreatetime");
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