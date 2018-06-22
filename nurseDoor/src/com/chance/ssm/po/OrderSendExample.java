package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderSendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderSendExample() {
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

        public Criteria andOrderSendIdIsNull() {
            addCriterion("order_send_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendIdIsNotNull() {
            addCriterion("order_send_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendIdEqualTo(String value) {
            addCriterion("order_send_id =", value, "orderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderSendIdNotEqualTo(String value) {
            addCriterion("order_send_id <>", value, "orderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderSendIdGreaterThan(String value) {
            addCriterion("order_send_id >", value, "orderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderSendIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_id >=", value, "orderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderSendIdLessThan(String value) {
            addCriterion("order_send_id <", value, "orderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderSendIdLessThanOrEqualTo(String value) {
            addCriterion("order_send_id <=", value, "orderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderSendIdLike(String value) {
            addCriterion("order_send_id like", value, "orderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderSendIdNotLike(String value) {
            addCriterion("order_send_id not like", value, "orderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderSendIdIn(List<String> values) {
            addCriterion("order_send_id in", values, "orderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderSendIdNotIn(List<String> values) {
            addCriterion("order_send_id not in", values, "orderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderSendIdBetween(String value1, String value2) {
            addCriterion("order_send_id between", value1, value2, "orderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderSendIdNotBetween(String value1, String value2) {
            addCriterion("order_send_id not between", value1, value2, "orderSendId");
            return (Criteria) this;
        }

        public Criteria andOrderSendNumbersIsNull() {
            addCriterion("order_send_numbers is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendNumbersIsNotNull() {
            addCriterion("order_send_numbers is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendNumbersEqualTo(String value) {
            addCriterion("order_send_numbers =", value, "orderSendNumbers");
            return (Criteria) this;
        }

        public Criteria andOrderSendNumbersNotEqualTo(String value) {
            addCriterion("order_send_numbers <>", value, "orderSendNumbers");
            return (Criteria) this;
        }

        public Criteria andOrderSendNumbersGreaterThan(String value) {
            addCriterion("order_send_numbers >", value, "orderSendNumbers");
            return (Criteria) this;
        }

        public Criteria andOrderSendNumbersGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_numbers >=", value, "orderSendNumbers");
            return (Criteria) this;
        }

        public Criteria andOrderSendNumbersLessThan(String value) {
            addCriterion("order_send_numbers <", value, "orderSendNumbers");
            return (Criteria) this;
        }

        public Criteria andOrderSendNumbersLessThanOrEqualTo(String value) {
            addCriterion("order_send_numbers <=", value, "orderSendNumbers");
            return (Criteria) this;
        }

        public Criteria andOrderSendNumbersLike(String value) {
            addCriterion("order_send_numbers like", value, "orderSendNumbers");
            return (Criteria) this;
        }

        public Criteria andOrderSendNumbersNotLike(String value) {
            addCriterion("order_send_numbers not like", value, "orderSendNumbers");
            return (Criteria) this;
        }

        public Criteria andOrderSendNumbersIn(List<String> values) {
            addCriterion("order_send_numbers in", values, "orderSendNumbers");
            return (Criteria) this;
        }

        public Criteria andOrderSendNumbersNotIn(List<String> values) {
            addCriterion("order_send_numbers not in", values, "orderSendNumbers");
            return (Criteria) this;
        }

        public Criteria andOrderSendNumbersBetween(String value1, String value2) {
            addCriterion("order_send_numbers between", value1, value2, "orderSendNumbers");
            return (Criteria) this;
        }

        public Criteria andOrderSendNumbersNotBetween(String value1, String value2) {
            addCriterion("order_send_numbers not between", value1, value2, "orderSendNumbers");
            return (Criteria) this;
        }

        public Criteria andOrderSendUseridIsNull() {
            addCriterion("order_send_userid is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendUseridIsNotNull() {
            addCriterion("order_send_userid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendUseridEqualTo(String value) {
            addCriterion("order_send_userid =", value, "orderSendUserid");
            return (Criteria) this;
        }

        public Criteria andOrderSendUseridNotEqualTo(String value) {
            addCriterion("order_send_userid <>", value, "orderSendUserid");
            return (Criteria) this;
        }

        public Criteria andOrderSendUseridGreaterThan(String value) {
            addCriterion("order_send_userid >", value, "orderSendUserid");
            return (Criteria) this;
        }

        public Criteria andOrderSendUseridGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_userid >=", value, "orderSendUserid");
            return (Criteria) this;
        }

        public Criteria andOrderSendUseridLessThan(String value) {
            addCriterion("order_send_userid <", value, "orderSendUserid");
            return (Criteria) this;
        }

        public Criteria andOrderSendUseridLessThanOrEqualTo(String value) {
            addCriterion("order_send_userid <=", value, "orderSendUserid");
            return (Criteria) this;
        }

        public Criteria andOrderSendUseridLike(String value) {
            addCriterion("order_send_userid like", value, "orderSendUserid");
            return (Criteria) this;
        }

        public Criteria andOrderSendUseridNotLike(String value) {
            addCriterion("order_send_userid not like", value, "orderSendUserid");
            return (Criteria) this;
        }

        public Criteria andOrderSendUseridIn(List<String> values) {
            addCriterion("order_send_userid in", values, "orderSendUserid");
            return (Criteria) this;
        }

        public Criteria andOrderSendUseridNotIn(List<String> values) {
            addCriterion("order_send_userid not in", values, "orderSendUserid");
            return (Criteria) this;
        }

        public Criteria andOrderSendUseridBetween(String value1, String value2) {
            addCriterion("order_send_userid between", value1, value2, "orderSendUserid");
            return (Criteria) this;
        }

        public Criteria andOrderSendUseridNotBetween(String value1, String value2) {
            addCriterion("order_send_userid not between", value1, value2, "orderSendUserid");
            return (Criteria) this;
        }

        public Criteria andOrderSendServicecontentIsNull() {
            addCriterion("order_send_servicecontent is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendServicecontentIsNotNull() {
            addCriterion("order_send_servicecontent is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendServicecontentEqualTo(String value) {
            addCriterion("order_send_servicecontent =", value, "orderSendServicecontent");
            return (Criteria) this;
        }

        public Criteria andOrderSendServicecontentNotEqualTo(String value) {
            addCriterion("order_send_servicecontent <>", value, "orderSendServicecontent");
            return (Criteria) this;
        }

        public Criteria andOrderSendServicecontentGreaterThan(String value) {
            addCriterion("order_send_servicecontent >", value, "orderSendServicecontent");
            return (Criteria) this;
        }

        public Criteria andOrderSendServicecontentGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_servicecontent >=", value, "orderSendServicecontent");
            return (Criteria) this;
        }

        public Criteria andOrderSendServicecontentLessThan(String value) {
            addCriterion("order_send_servicecontent <", value, "orderSendServicecontent");
            return (Criteria) this;
        }

        public Criteria andOrderSendServicecontentLessThanOrEqualTo(String value) {
            addCriterion("order_send_servicecontent <=", value, "orderSendServicecontent");
            return (Criteria) this;
        }

        public Criteria andOrderSendServicecontentLike(String value) {
            addCriterion("order_send_servicecontent like", value, "orderSendServicecontent");
            return (Criteria) this;
        }

        public Criteria andOrderSendServicecontentNotLike(String value) {
            addCriterion("order_send_servicecontent not like", value, "orderSendServicecontent");
            return (Criteria) this;
        }

        public Criteria andOrderSendServicecontentIn(List<String> values) {
            addCriterion("order_send_servicecontent in", values, "orderSendServicecontent");
            return (Criteria) this;
        }

        public Criteria andOrderSendServicecontentNotIn(List<String> values) {
            addCriterion("order_send_servicecontent not in", values, "orderSendServicecontent");
            return (Criteria) this;
        }

        public Criteria andOrderSendServicecontentBetween(String value1, String value2) {
            addCriterion("order_send_servicecontent between", value1, value2, "orderSendServicecontent");
            return (Criteria) this;
        }

        public Criteria andOrderSendServicecontentNotBetween(String value1, String value2) {
            addCriterion("order_send_servicecontent not between", value1, value2, "orderSendServicecontent");
            return (Criteria) this;
        }

        public Criteria andOrderSendUsernameIsNull() {
            addCriterion("order_send_username is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendUsernameIsNotNull() {
            addCriterion("order_send_username is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendUsernameEqualTo(String value) {
            addCriterion("order_send_username =", value, "orderSendUsername");
            return (Criteria) this;
        }

        public Criteria andOrderSendUsernameNotEqualTo(String value) {
            addCriterion("order_send_username <>", value, "orderSendUsername");
            return (Criteria) this;
        }

        public Criteria andOrderSendUsernameGreaterThan(String value) {
            addCriterion("order_send_username >", value, "orderSendUsername");
            return (Criteria) this;
        }

        public Criteria andOrderSendUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_username >=", value, "orderSendUsername");
            return (Criteria) this;
        }

        public Criteria andOrderSendUsernameLessThan(String value) {
            addCriterion("order_send_username <", value, "orderSendUsername");
            return (Criteria) this;
        }

        public Criteria andOrderSendUsernameLessThanOrEqualTo(String value) {
            addCriterion("order_send_username <=", value, "orderSendUsername");
            return (Criteria) this;
        }

        public Criteria andOrderSendUsernameLike(String value) {
            addCriterion("order_send_username like", value, "orderSendUsername");
            return (Criteria) this;
        }

        public Criteria andOrderSendUsernameNotLike(String value) {
            addCriterion("order_send_username not like", value, "orderSendUsername");
            return (Criteria) this;
        }

        public Criteria andOrderSendUsernameIn(List<String> values) {
            addCriterion("order_send_username in", values, "orderSendUsername");
            return (Criteria) this;
        }

        public Criteria andOrderSendUsernameNotIn(List<String> values) {
            addCriterion("order_send_username not in", values, "orderSendUsername");
            return (Criteria) this;
        }

        public Criteria andOrderSendUsernameBetween(String value1, String value2) {
            addCriterion("order_send_username between", value1, value2, "orderSendUsername");
            return (Criteria) this;
        }

        public Criteria andOrderSendUsernameNotBetween(String value1, String value2) {
            addCriterion("order_send_username not between", value1, value2, "orderSendUsername");
            return (Criteria) this;
        }

        public Criteria andOrderSendCardIsNull() {
            addCriterion("order_send_card is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendCardIsNotNull() {
            addCriterion("order_send_card is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendCardEqualTo(String value) {
            addCriterion("order_send_card =", value, "orderSendCard");
            return (Criteria) this;
        }

        public Criteria andOrderSendCardNotEqualTo(String value) {
            addCriterion("order_send_card <>", value, "orderSendCard");
            return (Criteria) this;
        }

        public Criteria andOrderSendCardGreaterThan(String value) {
            addCriterion("order_send_card >", value, "orderSendCard");
            return (Criteria) this;
        }

        public Criteria andOrderSendCardGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_card >=", value, "orderSendCard");
            return (Criteria) this;
        }

        public Criteria andOrderSendCardLessThan(String value) {
            addCriterion("order_send_card <", value, "orderSendCard");
            return (Criteria) this;
        }

        public Criteria andOrderSendCardLessThanOrEqualTo(String value) {
            addCriterion("order_send_card <=", value, "orderSendCard");
            return (Criteria) this;
        }

        public Criteria andOrderSendCardLike(String value) {
            addCriterion("order_send_card like", value, "orderSendCard");
            return (Criteria) this;
        }

        public Criteria andOrderSendCardNotLike(String value) {
            addCriterion("order_send_card not like", value, "orderSendCard");
            return (Criteria) this;
        }

        public Criteria andOrderSendCardIn(List<String> values) {
            addCriterion("order_send_card in", values, "orderSendCard");
            return (Criteria) this;
        }

        public Criteria andOrderSendCardNotIn(List<String> values) {
            addCriterion("order_send_card not in", values, "orderSendCard");
            return (Criteria) this;
        }

        public Criteria andOrderSendCardBetween(String value1, String value2) {
            addCriterion("order_send_card between", value1, value2, "orderSendCard");
            return (Criteria) this;
        }

        public Criteria andOrderSendCardNotBetween(String value1, String value2) {
            addCriterion("order_send_card not between", value1, value2, "orderSendCard");
            return (Criteria) this;
        }

        public Criteria andOrderSendSexIsNull() {
            addCriterion("order_send_sex is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendSexIsNotNull() {
            addCriterion("order_send_sex is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendSexEqualTo(String value) {
            addCriterion("order_send_sex =", value, "orderSendSex");
            return (Criteria) this;
        }

        public Criteria andOrderSendSexNotEqualTo(String value) {
            addCriterion("order_send_sex <>", value, "orderSendSex");
            return (Criteria) this;
        }

        public Criteria andOrderSendSexGreaterThan(String value) {
            addCriterion("order_send_sex >", value, "orderSendSex");
            return (Criteria) this;
        }

        public Criteria andOrderSendSexGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_sex >=", value, "orderSendSex");
            return (Criteria) this;
        }

        public Criteria andOrderSendSexLessThan(String value) {
            addCriterion("order_send_sex <", value, "orderSendSex");
            return (Criteria) this;
        }

        public Criteria andOrderSendSexLessThanOrEqualTo(String value) {
            addCriterion("order_send_sex <=", value, "orderSendSex");
            return (Criteria) this;
        }

        public Criteria andOrderSendSexLike(String value) {
            addCriterion("order_send_sex like", value, "orderSendSex");
            return (Criteria) this;
        }

        public Criteria andOrderSendSexNotLike(String value) {
            addCriterion("order_send_sex not like", value, "orderSendSex");
            return (Criteria) this;
        }

        public Criteria andOrderSendSexIn(List<String> values) {
            addCriterion("order_send_sex in", values, "orderSendSex");
            return (Criteria) this;
        }

        public Criteria andOrderSendSexNotIn(List<String> values) {
            addCriterion("order_send_sex not in", values, "orderSendSex");
            return (Criteria) this;
        }

        public Criteria andOrderSendSexBetween(String value1, String value2) {
            addCriterion("order_send_sex between", value1, value2, "orderSendSex");
            return (Criteria) this;
        }

        public Criteria andOrderSendSexNotBetween(String value1, String value2) {
            addCriterion("order_send_sex not between", value1, value2, "orderSendSex");
            return (Criteria) this;
        }

        public Criteria andOrderSendAgeIsNull() {
            addCriterion("order_send_age is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendAgeIsNotNull() {
            addCriterion("order_send_age is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendAgeEqualTo(String value) {
            addCriterion("order_send_age =", value, "orderSendAge");
            return (Criteria) this;
        }

        public Criteria andOrderSendAgeNotEqualTo(String value) {
            addCriterion("order_send_age <>", value, "orderSendAge");
            return (Criteria) this;
        }

        public Criteria andOrderSendAgeGreaterThan(String value) {
            addCriterion("order_send_age >", value, "orderSendAge");
            return (Criteria) this;
        }

        public Criteria andOrderSendAgeGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_age >=", value, "orderSendAge");
            return (Criteria) this;
        }

        public Criteria andOrderSendAgeLessThan(String value) {
            addCriterion("order_send_age <", value, "orderSendAge");
            return (Criteria) this;
        }

        public Criteria andOrderSendAgeLessThanOrEqualTo(String value) {
            addCriterion("order_send_age <=", value, "orderSendAge");
            return (Criteria) this;
        }

        public Criteria andOrderSendAgeLike(String value) {
            addCriterion("order_send_age like", value, "orderSendAge");
            return (Criteria) this;
        }

        public Criteria andOrderSendAgeNotLike(String value) {
            addCriterion("order_send_age not like", value, "orderSendAge");
            return (Criteria) this;
        }

        public Criteria andOrderSendAgeIn(List<String> values) {
            addCriterion("order_send_age in", values, "orderSendAge");
            return (Criteria) this;
        }

        public Criteria andOrderSendAgeNotIn(List<String> values) {
            addCriterion("order_send_age not in", values, "orderSendAge");
            return (Criteria) this;
        }

        public Criteria andOrderSendAgeBetween(String value1, String value2) {
            addCriterion("order_send_age between", value1, value2, "orderSendAge");
            return (Criteria) this;
        }

        public Criteria andOrderSendAgeNotBetween(String value1, String value2) {
            addCriterion("order_send_age not between", value1, value2, "orderSendAge");
            return (Criteria) this;
        }

        public Criteria andOrderSendAddreeIsNull() {
            addCriterion("order_send_addree is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendAddreeIsNotNull() {
            addCriterion("order_send_addree is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendAddreeEqualTo(String value) {
            addCriterion("order_send_addree =", value, "orderSendAddree");
            return (Criteria) this;
        }

        public Criteria andOrderSendAddreeNotEqualTo(String value) {
            addCriterion("order_send_addree <>", value, "orderSendAddree");
            return (Criteria) this;
        }

        public Criteria andOrderSendAddreeGreaterThan(String value) {
            addCriterion("order_send_addree >", value, "orderSendAddree");
            return (Criteria) this;
        }

        public Criteria andOrderSendAddreeGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_addree >=", value, "orderSendAddree");
            return (Criteria) this;
        }

        public Criteria andOrderSendAddreeLessThan(String value) {
            addCriterion("order_send_addree <", value, "orderSendAddree");
            return (Criteria) this;
        }

        public Criteria andOrderSendAddreeLessThanOrEqualTo(String value) {
            addCriterion("order_send_addree <=", value, "orderSendAddree");
            return (Criteria) this;
        }

        public Criteria andOrderSendAddreeLike(String value) {
            addCriterion("order_send_addree like", value, "orderSendAddree");
            return (Criteria) this;
        }

        public Criteria andOrderSendAddreeNotLike(String value) {
            addCriterion("order_send_addree not like", value, "orderSendAddree");
            return (Criteria) this;
        }

        public Criteria andOrderSendAddreeIn(List<String> values) {
            addCriterion("order_send_addree in", values, "orderSendAddree");
            return (Criteria) this;
        }

        public Criteria andOrderSendAddreeNotIn(List<String> values) {
            addCriterion("order_send_addree not in", values, "orderSendAddree");
            return (Criteria) this;
        }

        public Criteria andOrderSendAddreeBetween(String value1, String value2) {
            addCriterion("order_send_addree between", value1, value2, "orderSendAddree");
            return (Criteria) this;
        }

        public Criteria andOrderSendAddreeNotBetween(String value1, String value2) {
            addCriterion("order_send_addree not between", value1, value2, "orderSendAddree");
            return (Criteria) this;
        }

        public Criteria andOrderSendUserpicIsNull() {
            addCriterion("order_send_userpic is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendUserpicIsNotNull() {
            addCriterion("order_send_userpic is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendUserpicEqualTo(String value) {
            addCriterion("order_send_userpic =", value, "orderSendUserpic");
            return (Criteria) this;
        }

        public Criteria andOrderSendUserpicNotEqualTo(String value) {
            addCriterion("order_send_userpic <>", value, "orderSendUserpic");
            return (Criteria) this;
        }

        public Criteria andOrderSendUserpicGreaterThan(String value) {
            addCriterion("order_send_userpic >", value, "orderSendUserpic");
            return (Criteria) this;
        }

        public Criteria andOrderSendUserpicGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_userpic >=", value, "orderSendUserpic");
            return (Criteria) this;
        }

        public Criteria andOrderSendUserpicLessThan(String value) {
            addCriterion("order_send_userpic <", value, "orderSendUserpic");
            return (Criteria) this;
        }

        public Criteria andOrderSendUserpicLessThanOrEqualTo(String value) {
            addCriterion("order_send_userpic <=", value, "orderSendUserpic");
            return (Criteria) this;
        }

        public Criteria andOrderSendUserpicLike(String value) {
            addCriterion("order_send_userpic like", value, "orderSendUserpic");
            return (Criteria) this;
        }

        public Criteria andOrderSendUserpicNotLike(String value) {
            addCriterion("order_send_userpic not like", value, "orderSendUserpic");
            return (Criteria) this;
        }

        public Criteria andOrderSendUserpicIn(List<String> values) {
            addCriterion("order_send_userpic in", values, "orderSendUserpic");
            return (Criteria) this;
        }

        public Criteria andOrderSendUserpicNotIn(List<String> values) {
            addCriterion("order_send_userpic not in", values, "orderSendUserpic");
            return (Criteria) this;
        }

        public Criteria andOrderSendUserpicBetween(String value1, String value2) {
            addCriterion("order_send_userpic between", value1, value2, "orderSendUserpic");
            return (Criteria) this;
        }

        public Criteria andOrderSendUserpicNotBetween(String value1, String value2) {
            addCriterion("order_send_userpic not between", value1, value2, "orderSendUserpic");
            return (Criteria) this;
        }

        public Criteria andOrderSendNoteIsNull() {
            addCriterion("order_send_note is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendNoteIsNotNull() {
            addCriterion("order_send_note is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendNoteEqualTo(String value) {
            addCriterion("order_send_note =", value, "orderSendNote");
            return (Criteria) this;
        }

        public Criteria andOrderSendNoteNotEqualTo(String value) {
            addCriterion("order_send_note <>", value, "orderSendNote");
            return (Criteria) this;
        }

        public Criteria andOrderSendNoteGreaterThan(String value) {
            addCriterion("order_send_note >", value, "orderSendNote");
            return (Criteria) this;
        }

        public Criteria andOrderSendNoteGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_note >=", value, "orderSendNote");
            return (Criteria) this;
        }

        public Criteria andOrderSendNoteLessThan(String value) {
            addCriterion("order_send_note <", value, "orderSendNote");
            return (Criteria) this;
        }

        public Criteria andOrderSendNoteLessThanOrEqualTo(String value) {
            addCriterion("order_send_note <=", value, "orderSendNote");
            return (Criteria) this;
        }

        public Criteria andOrderSendNoteLike(String value) {
            addCriterion("order_send_note like", value, "orderSendNote");
            return (Criteria) this;
        }

        public Criteria andOrderSendNoteNotLike(String value) {
            addCriterion("order_send_note not like", value, "orderSendNote");
            return (Criteria) this;
        }

        public Criteria andOrderSendNoteIn(List<String> values) {
            addCriterion("order_send_note in", values, "orderSendNote");
            return (Criteria) this;
        }

        public Criteria andOrderSendNoteNotIn(List<String> values) {
            addCriterion("order_send_note not in", values, "orderSendNote");
            return (Criteria) this;
        }

        public Criteria andOrderSendNoteBetween(String value1, String value2) {
            addCriterion("order_send_note between", value1, value2, "orderSendNote");
            return (Criteria) this;
        }

        public Criteria andOrderSendNoteNotBetween(String value1, String value2) {
            addCriterion("order_send_note not between", value1, value2, "orderSendNote");
            return (Criteria) this;
        }

        public Criteria andOrderSendCouponIsNull() {
            addCriterion("order_send_coupon is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendCouponIsNotNull() {
            addCriterion("order_send_coupon is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendCouponEqualTo(String value) {
            addCriterion("order_send_coupon =", value, "orderSendCoupon");
            return (Criteria) this;
        }

        public Criteria andOrderSendCouponNotEqualTo(String value) {
            addCriterion("order_send_coupon <>", value, "orderSendCoupon");
            return (Criteria) this;
        }

        public Criteria andOrderSendCouponGreaterThan(String value) {
            addCriterion("order_send_coupon >", value, "orderSendCoupon");
            return (Criteria) this;
        }

        public Criteria andOrderSendCouponGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_coupon >=", value, "orderSendCoupon");
            return (Criteria) this;
        }

        public Criteria andOrderSendCouponLessThan(String value) {
            addCriterion("order_send_coupon <", value, "orderSendCoupon");
            return (Criteria) this;
        }

        public Criteria andOrderSendCouponLessThanOrEqualTo(String value) {
            addCriterion("order_send_coupon <=", value, "orderSendCoupon");
            return (Criteria) this;
        }

        public Criteria andOrderSendCouponLike(String value) {
            addCriterion("order_send_coupon like", value, "orderSendCoupon");
            return (Criteria) this;
        }

        public Criteria andOrderSendCouponNotLike(String value) {
            addCriterion("order_send_coupon not like", value, "orderSendCoupon");
            return (Criteria) this;
        }

        public Criteria andOrderSendCouponIn(List<String> values) {
            addCriterion("order_send_coupon in", values, "orderSendCoupon");
            return (Criteria) this;
        }

        public Criteria andOrderSendCouponNotIn(List<String> values) {
            addCriterion("order_send_coupon not in", values, "orderSendCoupon");
            return (Criteria) this;
        }

        public Criteria andOrderSendCouponBetween(String value1, String value2) {
            addCriterion("order_send_coupon between", value1, value2, "orderSendCoupon");
            return (Criteria) this;
        }

        public Criteria andOrderSendCouponNotBetween(String value1, String value2) {
            addCriterion("order_send_coupon not between", value1, value2, "orderSendCoupon");
            return (Criteria) this;
        }

        public Criteria andOrderSendTrafficmoneyIsNull() {
            addCriterion("order_send_trafficmoney is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendTrafficmoneyIsNotNull() {
            addCriterion("order_send_trafficmoney is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendTrafficmoneyEqualTo(BigDecimal value) {
            addCriterion("order_send_trafficmoney =", value, "orderSendTrafficmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTrafficmoneyNotEqualTo(BigDecimal value) {
            addCriterion("order_send_trafficmoney <>", value, "orderSendTrafficmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTrafficmoneyGreaterThan(BigDecimal value) {
            addCriterion("order_send_trafficmoney >", value, "orderSendTrafficmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTrafficmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_send_trafficmoney >=", value, "orderSendTrafficmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTrafficmoneyLessThan(BigDecimal value) {
            addCriterion("order_send_trafficmoney <", value, "orderSendTrafficmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTrafficmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_send_trafficmoney <=", value, "orderSendTrafficmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTrafficmoneyIn(List<BigDecimal> values) {
            addCriterion("order_send_trafficmoney in", values, "orderSendTrafficmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTrafficmoneyNotIn(List<BigDecimal> values) {
            addCriterion("order_send_trafficmoney not in", values, "orderSendTrafficmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTrafficmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_send_trafficmoney between", value1, value2, "orderSendTrafficmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTrafficmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_send_trafficmoney not between", value1, value2, "orderSendTrafficmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendSavemoneyIsNull() {
            addCriterion("order_send_savemoney is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendSavemoneyIsNotNull() {
            addCriterion("order_send_savemoney is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendSavemoneyEqualTo(BigDecimal value) {
            addCriterion("order_send_savemoney =", value, "orderSendSavemoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendSavemoneyNotEqualTo(BigDecimal value) {
            addCriterion("order_send_savemoney <>", value, "orderSendSavemoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendSavemoneyGreaterThan(BigDecimal value) {
            addCriterion("order_send_savemoney >", value, "orderSendSavemoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendSavemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_send_savemoney >=", value, "orderSendSavemoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendSavemoneyLessThan(BigDecimal value) {
            addCriterion("order_send_savemoney <", value, "orderSendSavemoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendSavemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_send_savemoney <=", value, "orderSendSavemoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendSavemoneyIn(List<BigDecimal> values) {
            addCriterion("order_send_savemoney in", values, "orderSendSavemoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendSavemoneyNotIn(List<BigDecimal> values) {
            addCriterion("order_send_savemoney not in", values, "orderSendSavemoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendSavemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_send_savemoney between", value1, value2, "orderSendSavemoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendSavemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_send_savemoney not between", value1, value2, "orderSendSavemoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendCostmoneyIsNull() {
            addCriterion("order_send_costmoney is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendCostmoneyIsNotNull() {
            addCriterion("order_send_costmoney is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendCostmoneyEqualTo(BigDecimal value) {
            addCriterion("order_send_costmoney =", value, "orderSendCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendCostmoneyNotEqualTo(BigDecimal value) {
            addCriterion("order_send_costmoney <>", value, "orderSendCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendCostmoneyGreaterThan(BigDecimal value) {
            addCriterion("order_send_costmoney >", value, "orderSendCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendCostmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_send_costmoney >=", value, "orderSendCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendCostmoneyLessThan(BigDecimal value) {
            addCriterion("order_send_costmoney <", value, "orderSendCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendCostmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_send_costmoney <=", value, "orderSendCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendCostmoneyIn(List<BigDecimal> values) {
            addCriterion("order_send_costmoney in", values, "orderSendCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendCostmoneyNotIn(List<BigDecimal> values) {
            addCriterion("order_send_costmoney not in", values, "orderSendCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendCostmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_send_costmoney between", value1, value2, "orderSendCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendCostmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_send_costmoney not between", value1, value2, "orderSendCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendIspaymentIsNull() {
            addCriterion("order_send_ispayment is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendIspaymentIsNotNull() {
            addCriterion("order_send_ispayment is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendIspaymentEqualTo(String value) {
            addCriterion("order_send_ispayment =", value, "orderSendIspayment");
            return (Criteria) this;
        }

        public Criteria andOrderSendIspaymentNotEqualTo(String value) {
            addCriterion("order_send_ispayment <>", value, "orderSendIspayment");
            return (Criteria) this;
        }

        public Criteria andOrderSendIspaymentGreaterThan(String value) {
            addCriterion("order_send_ispayment >", value, "orderSendIspayment");
            return (Criteria) this;
        }

        public Criteria andOrderSendIspaymentGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_ispayment >=", value, "orderSendIspayment");
            return (Criteria) this;
        }

        public Criteria andOrderSendIspaymentLessThan(String value) {
            addCriterion("order_send_ispayment <", value, "orderSendIspayment");
            return (Criteria) this;
        }

        public Criteria andOrderSendIspaymentLessThanOrEqualTo(String value) {
            addCriterion("order_send_ispayment <=", value, "orderSendIspayment");
            return (Criteria) this;
        }

        public Criteria andOrderSendIspaymentLike(String value) {
            addCriterion("order_send_ispayment like", value, "orderSendIspayment");
            return (Criteria) this;
        }

        public Criteria andOrderSendIspaymentNotLike(String value) {
            addCriterion("order_send_ispayment not like", value, "orderSendIspayment");
            return (Criteria) this;
        }

        public Criteria andOrderSendIspaymentIn(List<String> values) {
            addCriterion("order_send_ispayment in", values, "orderSendIspayment");
            return (Criteria) this;
        }

        public Criteria andOrderSendIspaymentNotIn(List<String> values) {
            addCriterion("order_send_ispayment not in", values, "orderSendIspayment");
            return (Criteria) this;
        }

        public Criteria andOrderSendIspaymentBetween(String value1, String value2) {
            addCriterion("order_send_ispayment between", value1, value2, "orderSendIspayment");
            return (Criteria) this;
        }

        public Criteria andOrderSendIspaymentNotBetween(String value1, String value2) {
            addCriterion("order_send_ispayment not between", value1, value2, "orderSendIspayment");
            return (Criteria) this;
        }

        public Criteria andOrderSendTotalmoneyIsNull() {
            addCriterion("order_send_totalmoney is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendTotalmoneyIsNotNull() {
            addCriterion("order_send_totalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendTotalmoneyEqualTo(String value) {
            addCriterion("order_send_totalmoney =", value, "orderSendTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTotalmoneyNotEqualTo(String value) {
            addCriterion("order_send_totalmoney <>", value, "orderSendTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTotalmoneyGreaterThan(String value) {
            addCriterion("order_send_totalmoney >", value, "orderSendTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTotalmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_totalmoney >=", value, "orderSendTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTotalmoneyLessThan(String value) {
            addCriterion("order_send_totalmoney <", value, "orderSendTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTotalmoneyLessThanOrEqualTo(String value) {
            addCriterion("order_send_totalmoney <=", value, "orderSendTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTotalmoneyLike(String value) {
            addCriterion("order_send_totalmoney like", value, "orderSendTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTotalmoneyNotLike(String value) {
            addCriterion("order_send_totalmoney not like", value, "orderSendTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTotalmoneyIn(List<String> values) {
            addCriterion("order_send_totalmoney in", values, "orderSendTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTotalmoneyNotIn(List<String> values) {
            addCriterion("order_send_totalmoney not in", values, "orderSendTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTotalmoneyBetween(String value1, String value2) {
            addCriterion("order_send_totalmoney between", value1, value2, "orderSendTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendTotalmoneyNotBetween(String value1, String value2) {
            addCriterion("order_send_totalmoney not between", value1, value2, "orderSendTotalmoney");
            return (Criteria) this;
        }

        public Criteria andOrderSendIssafeIsNull() {
            addCriterion("order_send_issafe is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendIssafeIsNotNull() {
            addCriterion("order_send_issafe is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendIssafeEqualTo(String value) {
            addCriterion("order_send_issafe =", value, "orderSendIssafe");
            return (Criteria) this;
        }

        public Criteria andOrderSendIssafeNotEqualTo(String value) {
            addCriterion("order_send_issafe <>", value, "orderSendIssafe");
            return (Criteria) this;
        }

        public Criteria andOrderSendIssafeGreaterThan(String value) {
            addCriterion("order_send_issafe >", value, "orderSendIssafe");
            return (Criteria) this;
        }

        public Criteria andOrderSendIssafeGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_issafe >=", value, "orderSendIssafe");
            return (Criteria) this;
        }

        public Criteria andOrderSendIssafeLessThan(String value) {
            addCriterion("order_send_issafe <", value, "orderSendIssafe");
            return (Criteria) this;
        }

        public Criteria andOrderSendIssafeLessThanOrEqualTo(String value) {
            addCriterion("order_send_issafe <=", value, "orderSendIssafe");
            return (Criteria) this;
        }

        public Criteria andOrderSendIssafeLike(String value) {
            addCriterion("order_send_issafe like", value, "orderSendIssafe");
            return (Criteria) this;
        }

        public Criteria andOrderSendIssafeNotLike(String value) {
            addCriterion("order_send_issafe not like", value, "orderSendIssafe");
            return (Criteria) this;
        }

        public Criteria andOrderSendIssafeIn(List<String> values) {
            addCriterion("order_send_issafe in", values, "orderSendIssafe");
            return (Criteria) this;
        }

        public Criteria andOrderSendIssafeNotIn(List<String> values) {
            addCriterion("order_send_issafe not in", values, "orderSendIssafe");
            return (Criteria) this;
        }

        public Criteria andOrderSendIssafeBetween(String value1, String value2) {
            addCriterion("order_send_issafe between", value1, value2, "orderSendIssafe");
            return (Criteria) this;
        }

        public Criteria andOrderSendIssafeNotBetween(String value1, String value2) {
            addCriterion("order_send_issafe not between", value1, value2, "orderSendIssafe");
            return (Criteria) this;
        }

        public Criteria andOrderSendTypeIsNull() {
            addCriterion("order_send_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendTypeIsNotNull() {
            addCriterion("order_send_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendTypeEqualTo(String value) {
            addCriterion("order_send_type =", value, "orderSendType");
            return (Criteria) this;
        }

        public Criteria andOrderSendTypeNotEqualTo(String value) {
            addCriterion("order_send_type <>", value, "orderSendType");
            return (Criteria) this;
        }

        public Criteria andOrderSendTypeGreaterThan(String value) {
            addCriterion("order_send_type >", value, "orderSendType");
            return (Criteria) this;
        }

        public Criteria andOrderSendTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_type >=", value, "orderSendType");
            return (Criteria) this;
        }

        public Criteria andOrderSendTypeLessThan(String value) {
            addCriterion("order_send_type <", value, "orderSendType");
            return (Criteria) this;
        }

        public Criteria andOrderSendTypeLessThanOrEqualTo(String value) {
            addCriterion("order_send_type <=", value, "orderSendType");
            return (Criteria) this;
        }

        public Criteria andOrderSendTypeLike(String value) {
            addCriterion("order_send_type like", value, "orderSendType");
            return (Criteria) this;
        }

        public Criteria andOrderSendTypeNotLike(String value) {
            addCriterion("order_send_type not like", value, "orderSendType");
            return (Criteria) this;
        }

        public Criteria andOrderSendTypeIn(List<String> values) {
            addCriterion("order_send_type in", values, "orderSendType");
            return (Criteria) this;
        }

        public Criteria andOrderSendTypeNotIn(List<String> values) {
            addCriterion("order_send_type not in", values, "orderSendType");
            return (Criteria) this;
        }

        public Criteria andOrderSendTypeBetween(String value1, String value2) {
            addCriterion("order_send_type between", value1, value2, "orderSendType");
            return (Criteria) this;
        }

        public Criteria andOrderSendTypeNotBetween(String value1, String value2) {
            addCriterion("order_send_type not between", value1, value2, "orderSendType");
            return (Criteria) this;
        }

        public Criteria andOrderSendStateIsNull() {
            addCriterion("order_send_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendStateIsNotNull() {
            addCriterion("order_send_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendStateEqualTo(String value) {
            addCriterion("order_send_state =", value, "orderSendState");
            return (Criteria) this;
        }

        public Criteria andOrderSendStateNotEqualTo(String value) {
            addCriterion("order_send_state <>", value, "orderSendState");
            return (Criteria) this;
        }

        public Criteria andOrderSendStateGreaterThan(String value) {
            addCriterion("order_send_state >", value, "orderSendState");
            return (Criteria) this;
        }

        public Criteria andOrderSendStateGreaterThanOrEqualTo(String value) {
            addCriterion("order_send_state >=", value, "orderSendState");
            return (Criteria) this;
        }

        public Criteria andOrderSendStateLessThan(String value) {
            addCriterion("order_send_state <", value, "orderSendState");
            return (Criteria) this;
        }

        public Criteria andOrderSendStateLessThanOrEqualTo(String value) {
            addCriterion("order_send_state <=", value, "orderSendState");
            return (Criteria) this;
        }

        public Criteria andOrderSendStateLike(String value) {
            addCriterion("order_send_state like", value, "orderSendState");
            return (Criteria) this;
        }

        public Criteria andOrderSendStateNotLike(String value) {
            addCriterion("order_send_state not like", value, "orderSendState");
            return (Criteria) this;
        }

        public Criteria andOrderSendStateIn(List<String> values) {
            addCriterion("order_send_state in", values, "orderSendState");
            return (Criteria) this;
        }

        public Criteria andOrderSendStateNotIn(List<String> values) {
            addCriterion("order_send_state not in", values, "orderSendState");
            return (Criteria) this;
        }

        public Criteria andOrderSendStateBetween(String value1, String value2) {
            addCriterion("order_send_state between", value1, value2, "orderSendState");
            return (Criteria) this;
        }

        public Criteria andOrderSendStateNotBetween(String value1, String value2) {
            addCriterion("order_send_state not between", value1, value2, "orderSendState");
            return (Criteria) this;
        }

        public Criteria andOrderSendBegintimeIsNull() {
            addCriterion("order_send_begintime is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendBegintimeIsNotNull() {
            addCriterion("order_send_begintime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendBegintimeEqualTo(Date value) {
            addCriterion("order_send_begintime =", value, "orderSendBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderSendBegintimeNotEqualTo(Date value) {
            addCriterion("order_send_begintime <>", value, "orderSendBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderSendBegintimeGreaterThan(Date value) {
            addCriterion("order_send_begintime >", value, "orderSendBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderSendBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_send_begintime >=", value, "orderSendBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderSendBegintimeLessThan(Date value) {
            addCriterion("order_send_begintime <", value, "orderSendBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderSendBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("order_send_begintime <=", value, "orderSendBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderSendBegintimeIn(List<Date> values) {
            addCriterion("order_send_begintime in", values, "orderSendBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderSendBegintimeNotIn(List<Date> values) {
            addCriterion("order_send_begintime not in", values, "orderSendBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderSendBegintimeBetween(Date value1, Date value2) {
            addCriterion("order_send_begintime between", value1, value2, "orderSendBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderSendBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("order_send_begintime not between", value1, value2, "orderSendBegintime");
            return (Criteria) this;
        }

        public Criteria andOrderSendStoptimeIsNull() {
            addCriterion("order_send_stoptime is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendStoptimeIsNotNull() {
            addCriterion("order_send_stoptime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendStoptimeEqualTo(Date value) {
            addCriterion("order_send_stoptime =", value, "orderSendStoptime");
            return (Criteria) this;
        }

        public Criteria andOrderSendStoptimeNotEqualTo(Date value) {
            addCriterion("order_send_stoptime <>", value, "orderSendStoptime");
            return (Criteria) this;
        }

        public Criteria andOrderSendStoptimeGreaterThan(Date value) {
            addCriterion("order_send_stoptime >", value, "orderSendStoptime");
            return (Criteria) this;
        }

        public Criteria andOrderSendStoptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_send_stoptime >=", value, "orderSendStoptime");
            return (Criteria) this;
        }

        public Criteria andOrderSendStoptimeLessThan(Date value) {
            addCriterion("order_send_stoptime <", value, "orderSendStoptime");
            return (Criteria) this;
        }

        public Criteria andOrderSendStoptimeLessThanOrEqualTo(Date value) {
            addCriterion("order_send_stoptime <=", value, "orderSendStoptime");
            return (Criteria) this;
        }

        public Criteria andOrderSendStoptimeIn(List<Date> values) {
            addCriterion("order_send_stoptime in", values, "orderSendStoptime");
            return (Criteria) this;
        }

        public Criteria andOrderSendStoptimeNotIn(List<Date> values) {
            addCriterion("order_send_stoptime not in", values, "orderSendStoptime");
            return (Criteria) this;
        }

        public Criteria andOrderSendStoptimeBetween(Date value1, Date value2) {
            addCriterion("order_send_stoptime between", value1, value2, "orderSendStoptime");
            return (Criteria) this;
        }

        public Criteria andOrderSendStoptimeNotBetween(Date value1, Date value2) {
            addCriterion("order_send_stoptime not between", value1, value2, "orderSendStoptime");
            return (Criteria) this;
        }

        public Criteria andOrderSendGetOrderTimeIsNull() {
            addCriterion("order_send_get_order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendGetOrderTimeIsNotNull() {
            addCriterion("order_send_get_order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendGetOrderTimeEqualTo(Date value) {
            addCriterion("order_send_get_order_time =", value, "orderSendGetOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendGetOrderTimeNotEqualTo(Date value) {
            addCriterion("order_send_get_order_time <>", value, "orderSendGetOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendGetOrderTimeGreaterThan(Date value) {
            addCriterion("order_send_get_order_time >", value, "orderSendGetOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendGetOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_send_get_order_time >=", value, "orderSendGetOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendGetOrderTimeLessThan(Date value) {
            addCriterion("order_send_get_order_time <", value, "orderSendGetOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendGetOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_send_get_order_time <=", value, "orderSendGetOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendGetOrderTimeIn(List<Date> values) {
            addCriterion("order_send_get_order_time in", values, "orderSendGetOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendGetOrderTimeNotIn(List<Date> values) {
            addCriterion("order_send_get_order_time not in", values, "orderSendGetOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendGetOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_send_get_order_time between", value1, value2, "orderSendGetOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendGetOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_send_get_order_time not between", value1, value2, "orderSendGetOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendFinishOrderTimeIsNull() {
            addCriterion("order_send_finish_order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendFinishOrderTimeIsNotNull() {
            addCriterion("order_send_finish_order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendFinishOrderTimeEqualTo(Date value) {
            addCriterion("order_send_finish_order_time =", value, "orderSendFinishOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendFinishOrderTimeNotEqualTo(Date value) {
            addCriterion("order_send_finish_order_time <>", value, "orderSendFinishOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendFinishOrderTimeGreaterThan(Date value) {
            addCriterion("order_send_finish_order_time >", value, "orderSendFinishOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendFinishOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_send_finish_order_time >=", value, "orderSendFinishOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendFinishOrderTimeLessThan(Date value) {
            addCriterion("order_send_finish_order_time <", value, "orderSendFinishOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendFinishOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_send_finish_order_time <=", value, "orderSendFinishOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendFinishOrderTimeIn(List<Date> values) {
            addCriterion("order_send_finish_order_time in", values, "orderSendFinishOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendFinishOrderTimeNotIn(List<Date> values) {
            addCriterion("order_send_finish_order_time not in", values, "orderSendFinishOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendFinishOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_send_finish_order_time between", value1, value2, "orderSendFinishOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendFinishOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_send_finish_order_time not between", value1, value2, "orderSendFinishOrderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendCreatetimeIsNull() {
            addCriterion("order_send_createtime is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendCreatetimeIsNotNull() {
            addCriterion("order_send_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendCreatetimeEqualTo(Date value) {
            addCriterion("order_send_createtime =", value, "orderSendCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendCreatetimeNotEqualTo(Date value) {
            addCriterion("order_send_createtime <>", value, "orderSendCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendCreatetimeGreaterThan(Date value) {
            addCriterion("order_send_createtime >", value, "orderSendCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_send_createtime >=", value, "orderSendCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendCreatetimeLessThan(Date value) {
            addCriterion("order_send_createtime <", value, "orderSendCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("order_send_createtime <=", value, "orderSendCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendCreatetimeIn(List<Date> values) {
            addCriterion("order_send_createtime in", values, "orderSendCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendCreatetimeNotIn(List<Date> values) {
            addCriterion("order_send_createtime not in", values, "orderSendCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendCreatetimeBetween(Date value1, Date value2) {
            addCriterion("order_send_createtime between", value1, value2, "orderSendCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderSendCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("order_send_createtime not between", value1, value2, "orderSendCreatetime");
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