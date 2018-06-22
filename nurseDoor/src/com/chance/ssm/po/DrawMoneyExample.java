package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DrawMoneyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrawMoneyExample() {
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

        public Criteria andDrawMoneyIdIsNull() {
            addCriterion("draw_money_id is null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIdIsNotNull() {
            addCriterion("draw_money_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIdEqualTo(String value) {
            addCriterion("draw_money_id =", value, "drawMoneyId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIdNotEqualTo(String value) {
            addCriterion("draw_money_id <>", value, "drawMoneyId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIdGreaterThan(String value) {
            addCriterion("draw_money_id >", value, "drawMoneyId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIdGreaterThanOrEqualTo(String value) {
            addCriterion("draw_money_id >=", value, "drawMoneyId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIdLessThan(String value) {
            addCriterion("draw_money_id <", value, "drawMoneyId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIdLessThanOrEqualTo(String value) {
            addCriterion("draw_money_id <=", value, "drawMoneyId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIdLike(String value) {
            addCriterion("draw_money_id like", value, "drawMoneyId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIdNotLike(String value) {
            addCriterion("draw_money_id not like", value, "drawMoneyId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIdIn(List<String> values) {
            addCriterion("draw_money_id in", values, "drawMoneyId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIdNotIn(List<String> values) {
            addCriterion("draw_money_id not in", values, "drawMoneyId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIdBetween(String value1, String value2) {
            addCriterion("draw_money_id between", value1, value2, "drawMoneyId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyIdNotBetween(String value1, String value2) {
            addCriterion("draw_money_id not between", value1, value2, "drawMoneyId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySizeIsNull() {
            addCriterion("draw_money_size is null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySizeIsNotNull() {
            addCriterion("draw_money_size is not null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySizeEqualTo(BigDecimal value) {
            addCriterion("draw_money_size =", value, "drawMoneySize");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySizeNotEqualTo(BigDecimal value) {
            addCriterion("draw_money_size <>", value, "drawMoneySize");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySizeGreaterThan(BigDecimal value) {
            addCriterion("draw_money_size >", value, "drawMoneySize");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("draw_money_size >=", value, "drawMoneySize");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySizeLessThan(BigDecimal value) {
            addCriterion("draw_money_size <", value, "drawMoneySize");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("draw_money_size <=", value, "drawMoneySize");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySizeIn(List<BigDecimal> values) {
            addCriterion("draw_money_size in", values, "drawMoneySize");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySizeNotIn(List<BigDecimal> values) {
            addCriterion("draw_money_size not in", values, "drawMoneySize");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("draw_money_size between", value1, value2, "drawMoneySize");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("draw_money_size not between", value1, value2, "drawMoneySize");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdIsNull() {
            addCriterion("draw_money_users_id is null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdIsNotNull() {
            addCriterion("draw_money_users_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdEqualTo(String value) {
            addCriterion("draw_money_users_id =", value, "drawMoneyUsersId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdNotEqualTo(String value) {
            addCriterion("draw_money_users_id <>", value, "drawMoneyUsersId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdGreaterThan(String value) {
            addCriterion("draw_money_users_id >", value, "drawMoneyUsersId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdGreaterThanOrEqualTo(String value) {
            addCriterion("draw_money_users_id >=", value, "drawMoneyUsersId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdLessThan(String value) {
            addCriterion("draw_money_users_id <", value, "drawMoneyUsersId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdLessThanOrEqualTo(String value) {
            addCriterion("draw_money_users_id <=", value, "drawMoneyUsersId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdLike(String value) {
            addCriterion("draw_money_users_id like", value, "drawMoneyUsersId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdNotLike(String value) {
            addCriterion("draw_money_users_id not like", value, "drawMoneyUsersId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdIn(List<String> values) {
            addCriterion("draw_money_users_id in", values, "drawMoneyUsersId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdNotIn(List<String> values) {
            addCriterion("draw_money_users_id not in", values, "drawMoneyUsersId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdBetween(String value1, String value2) {
            addCriterion("draw_money_users_id between", value1, value2, "drawMoneyUsersId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdNotBetween(String value1, String value2) {
            addCriterion("draw_money_users_id not between", value1, value2, "drawMoneyUsersId");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdentityIsNull() {
            addCriterion("draw_money_users_identity is null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdentityIsNotNull() {
            addCriterion("draw_money_users_identity is not null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdentityEqualTo(Integer value) {
            addCriterion("draw_money_users_identity =", value, "drawMoneyUsersIdentity");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdentityNotEqualTo(Integer value) {
            addCriterion("draw_money_users_identity <>", value, "drawMoneyUsersIdentity");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdentityGreaterThan(Integer value) {
            addCriterion("draw_money_users_identity >", value, "drawMoneyUsersIdentity");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdentityGreaterThanOrEqualTo(Integer value) {
            addCriterion("draw_money_users_identity >=", value, "drawMoneyUsersIdentity");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdentityLessThan(Integer value) {
            addCriterion("draw_money_users_identity <", value, "drawMoneyUsersIdentity");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdentityLessThanOrEqualTo(Integer value) {
            addCriterion("draw_money_users_identity <=", value, "drawMoneyUsersIdentity");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdentityIn(List<Integer> values) {
            addCriterion("draw_money_users_identity in", values, "drawMoneyUsersIdentity");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdentityNotIn(List<Integer> values) {
            addCriterion("draw_money_users_identity not in", values, "drawMoneyUsersIdentity");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdentityBetween(Integer value1, Integer value2) {
            addCriterion("draw_money_users_identity between", value1, value2, "drawMoneyUsersIdentity");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyUsersIdentityNotBetween(Integer value1, Integer value2) {
            addCriterion("draw_money_users_identity not between", value1, value2, "drawMoneyUsersIdentity");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandleterIsNull() {
            addCriterion("draw_money_handleter is null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandleterIsNotNull() {
            addCriterion("draw_money_handleter is not null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandleterEqualTo(String value) {
            addCriterion("draw_money_handleter =", value, "drawMoneyHandleter");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandleterNotEqualTo(String value) {
            addCriterion("draw_money_handleter <>", value, "drawMoneyHandleter");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandleterGreaterThan(String value) {
            addCriterion("draw_money_handleter >", value, "drawMoneyHandleter");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandleterGreaterThanOrEqualTo(String value) {
            addCriterion("draw_money_handleter >=", value, "drawMoneyHandleter");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandleterLessThan(String value) {
            addCriterion("draw_money_handleter <", value, "drawMoneyHandleter");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandleterLessThanOrEqualTo(String value) {
            addCriterion("draw_money_handleter <=", value, "drawMoneyHandleter");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandleterLike(String value) {
            addCriterion("draw_money_handleter like", value, "drawMoneyHandleter");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandleterNotLike(String value) {
            addCriterion("draw_money_handleter not like", value, "drawMoneyHandleter");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandleterIn(List<String> values) {
            addCriterion("draw_money_handleter in", values, "drawMoneyHandleter");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandleterNotIn(List<String> values) {
            addCriterion("draw_money_handleter not in", values, "drawMoneyHandleter");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandleterBetween(String value1, String value2) {
            addCriterion("draw_money_handleter between", value1, value2, "drawMoneyHandleter");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandleterNotBetween(String value1, String value2) {
            addCriterion("draw_money_handleter not between", value1, value2, "drawMoneyHandleter");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNoteIsNull() {
            addCriterion("draw_money_note is null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNoteIsNotNull() {
            addCriterion("draw_money_note is not null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNoteEqualTo(String value) {
            addCriterion("draw_money_note =", value, "drawMoneyNote");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNoteNotEqualTo(String value) {
            addCriterion("draw_money_note <>", value, "drawMoneyNote");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNoteGreaterThan(String value) {
            addCriterion("draw_money_note >", value, "drawMoneyNote");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNoteGreaterThanOrEqualTo(String value) {
            addCriterion("draw_money_note >=", value, "drawMoneyNote");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNoteLessThan(String value) {
            addCriterion("draw_money_note <", value, "drawMoneyNote");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNoteLessThanOrEqualTo(String value) {
            addCriterion("draw_money_note <=", value, "drawMoneyNote");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNoteLike(String value) {
            addCriterion("draw_money_note like", value, "drawMoneyNote");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNoteNotLike(String value) {
            addCriterion("draw_money_note not like", value, "drawMoneyNote");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNoteIn(List<String> values) {
            addCriterion("draw_money_note in", values, "drawMoneyNote");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNoteNotIn(List<String> values) {
            addCriterion("draw_money_note not in", values, "drawMoneyNote");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNoteBetween(String value1, String value2) {
            addCriterion("draw_money_note between", value1, value2, "drawMoneyNote");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyNoteNotBetween(String value1, String value2) {
            addCriterion("draw_money_note not between", value1, value2, "drawMoneyNote");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySpeakIsNull() {
            addCriterion("draw_money_speak is null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySpeakIsNotNull() {
            addCriterion("draw_money_speak is not null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySpeakEqualTo(String value) {
            addCriterion("draw_money_speak =", value, "drawMoneySpeak");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySpeakNotEqualTo(String value) {
            addCriterion("draw_money_speak <>", value, "drawMoneySpeak");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySpeakGreaterThan(String value) {
            addCriterion("draw_money_speak >", value, "drawMoneySpeak");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySpeakGreaterThanOrEqualTo(String value) {
            addCriterion("draw_money_speak >=", value, "drawMoneySpeak");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySpeakLessThan(String value) {
            addCriterion("draw_money_speak <", value, "drawMoneySpeak");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySpeakLessThanOrEqualTo(String value) {
            addCriterion("draw_money_speak <=", value, "drawMoneySpeak");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySpeakLike(String value) {
            addCriterion("draw_money_speak like", value, "drawMoneySpeak");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySpeakNotLike(String value) {
            addCriterion("draw_money_speak not like", value, "drawMoneySpeak");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySpeakIn(List<String> values) {
            addCriterion("draw_money_speak in", values, "drawMoneySpeak");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySpeakNotIn(List<String> values) {
            addCriterion("draw_money_speak not in", values, "drawMoneySpeak");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySpeakBetween(String value1, String value2) {
            addCriterion("draw_money_speak between", value1, value2, "drawMoneySpeak");
            return (Criteria) this;
        }

        public Criteria andDrawMoneySpeakNotBetween(String value1, String value2) {
            addCriterion("draw_money_speak not between", value1, value2, "drawMoneySpeak");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyOverIsNull() {
            addCriterion("draw_money_over is null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyOverIsNotNull() {
            addCriterion("draw_money_over is not null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyOverEqualTo(String value) {
            addCriterion("draw_money_over =", value, "drawMoneyOver");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyOverNotEqualTo(String value) {
            addCriterion("draw_money_over <>", value, "drawMoneyOver");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyOverGreaterThan(String value) {
            addCriterion("draw_money_over >", value, "drawMoneyOver");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyOverGreaterThanOrEqualTo(String value) {
            addCriterion("draw_money_over >=", value, "drawMoneyOver");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyOverLessThan(String value) {
            addCriterion("draw_money_over <", value, "drawMoneyOver");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyOverLessThanOrEqualTo(String value) {
            addCriterion("draw_money_over <=", value, "drawMoneyOver");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyOverLike(String value) {
            addCriterion("draw_money_over like", value, "drawMoneyOver");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyOverNotLike(String value) {
            addCriterion("draw_money_over not like", value, "drawMoneyOver");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyOverIn(List<String> values) {
            addCriterion("draw_money_over in", values, "drawMoneyOver");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyOverNotIn(List<String> values) {
            addCriterion("draw_money_over not in", values, "drawMoneyOver");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyOverBetween(String value1, String value2) {
            addCriterion("draw_money_over between", value1, value2, "drawMoneyOver");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyOverNotBetween(String value1, String value2) {
            addCriterion("draw_money_over not between", value1, value2, "drawMoneyOver");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyStateIsNull() {
            addCriterion("draw_money_state is null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyStateIsNotNull() {
            addCriterion("draw_money_state is not null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyStateEqualTo(Integer value) {
            addCriterion("draw_money_state =", value, "drawMoneyState");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyStateNotEqualTo(Integer value) {
            addCriterion("draw_money_state <>", value, "drawMoneyState");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyStateGreaterThan(Integer value) {
            addCriterion("draw_money_state >", value, "drawMoneyState");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("draw_money_state >=", value, "drawMoneyState");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyStateLessThan(Integer value) {
            addCriterion("draw_money_state <", value, "drawMoneyState");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyStateLessThanOrEqualTo(Integer value) {
            addCriterion("draw_money_state <=", value, "drawMoneyState");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyStateIn(List<Integer> values) {
            addCriterion("draw_money_state in", values, "drawMoneyState");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyStateNotIn(List<Integer> values) {
            addCriterion("draw_money_state not in", values, "drawMoneyState");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyStateBetween(Integer value1, Integer value2) {
            addCriterion("draw_money_state between", value1, value2, "drawMoneyState");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyStateNotBetween(Integer value1, Integer value2) {
            addCriterion("draw_money_state not between", value1, value2, "drawMoneyState");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyCreatetimeIsNull() {
            addCriterion("draw_money_createtime is null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyCreatetimeIsNotNull() {
            addCriterion("draw_money_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyCreatetimeEqualTo(Date value) {
            addCriterion("draw_money_createtime =", value, "drawMoneyCreatetime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyCreatetimeNotEqualTo(Date value) {
            addCriterion("draw_money_createtime <>", value, "drawMoneyCreatetime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyCreatetimeGreaterThan(Date value) {
            addCriterion("draw_money_createtime >", value, "drawMoneyCreatetime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("draw_money_createtime >=", value, "drawMoneyCreatetime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyCreatetimeLessThan(Date value) {
            addCriterion("draw_money_createtime <", value, "drawMoneyCreatetime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("draw_money_createtime <=", value, "drawMoneyCreatetime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyCreatetimeIn(List<Date> values) {
            addCriterion("draw_money_createtime in", values, "drawMoneyCreatetime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyCreatetimeNotIn(List<Date> values) {
            addCriterion("draw_money_createtime not in", values, "drawMoneyCreatetime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyCreatetimeBetween(Date value1, Date value2) {
            addCriterion("draw_money_createtime between", value1, value2, "drawMoneyCreatetime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("draw_money_createtime not between", value1, value2, "drawMoneyCreatetime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandletimeIsNull() {
            addCriterion("draw_money_handletime is null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandletimeIsNotNull() {
            addCriterion("draw_money_handletime is not null");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandletimeEqualTo(Date value) {
            addCriterion("draw_money_handletime =", value, "drawMoneyHandletime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandletimeNotEqualTo(Date value) {
            addCriterion("draw_money_handletime <>", value, "drawMoneyHandletime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandletimeGreaterThan(Date value) {
            addCriterion("draw_money_handletime >", value, "drawMoneyHandletime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandletimeGreaterThanOrEqualTo(Date value) {
            addCriterion("draw_money_handletime >=", value, "drawMoneyHandletime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandletimeLessThan(Date value) {
            addCriterion("draw_money_handletime <", value, "drawMoneyHandletime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandletimeLessThanOrEqualTo(Date value) {
            addCriterion("draw_money_handletime <=", value, "drawMoneyHandletime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandletimeIn(List<Date> values) {
            addCriterion("draw_money_handletime in", values, "drawMoneyHandletime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandletimeNotIn(List<Date> values) {
            addCriterion("draw_money_handletime not in", values, "drawMoneyHandletime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandletimeBetween(Date value1, Date value2) {
            addCriterion("draw_money_handletime between", value1, value2, "drawMoneyHandletime");
            return (Criteria) this;
        }

        public Criteria andDrawMoneyHandletimeNotBetween(Date value1, Date value2) {
            addCriterion("draw_money_handletime not between", value1, value2, "drawMoneyHandletime");
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