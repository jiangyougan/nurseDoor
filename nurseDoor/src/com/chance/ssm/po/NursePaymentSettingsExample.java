package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NursePaymentSettingsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NursePaymentSettingsExample() {
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

        public Criteria andNursePaymentSettingsNurseIdIsNull() {
            addCriterion("nurse_payment_settings_nurse_id is null");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsNurseIdIsNotNull() {
            addCriterion("nurse_payment_settings_nurse_id is not null");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsNurseIdEqualTo(String value) {
            addCriterion("nurse_payment_settings_nurse_id =", value, "nursePaymentSettingsNurseId");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsNurseIdNotEqualTo(String value) {
            addCriterion("nurse_payment_settings_nurse_id <>", value, "nursePaymentSettingsNurseId");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsNurseIdGreaterThan(String value) {
            addCriterion("nurse_payment_settings_nurse_id >", value, "nursePaymentSettingsNurseId");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsNurseIdGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_payment_settings_nurse_id >=", value, "nursePaymentSettingsNurseId");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsNurseIdLessThan(String value) {
            addCriterion("nurse_payment_settings_nurse_id <", value, "nursePaymentSettingsNurseId");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsNurseIdLessThanOrEqualTo(String value) {
            addCriterion("nurse_payment_settings_nurse_id <=", value, "nursePaymentSettingsNurseId");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsNurseIdLike(String value) {
            addCriterion("nurse_payment_settings_nurse_id like", value, "nursePaymentSettingsNurseId");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsNurseIdNotLike(String value) {
            addCriterion("nurse_payment_settings_nurse_id not like", value, "nursePaymentSettingsNurseId");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsNurseIdIn(List<String> values) {
            addCriterion("nurse_payment_settings_nurse_id in", values, "nursePaymentSettingsNurseId");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsNurseIdNotIn(List<String> values) {
            addCriterion("nurse_payment_settings_nurse_id not in", values, "nursePaymentSettingsNurseId");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsNurseIdBetween(String value1, String value2) {
            addCriterion("nurse_payment_settings_nurse_id between", value1, value2, "nursePaymentSettingsNurseId");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsNurseIdNotBetween(String value1, String value2) {
            addCriterion("nurse_payment_settings_nurse_id not between", value1, value2, "nursePaymentSettingsNurseId");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsPwdIsNull() {
            addCriterion("nurse_payment_settings_pwd is null");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsPwdIsNotNull() {
            addCriterion("nurse_payment_settings_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsPwdEqualTo(String value) {
            addCriterion("nurse_payment_settings_pwd =", value, "nursePaymentSettingsPwd");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsPwdNotEqualTo(String value) {
            addCriterion("nurse_payment_settings_pwd <>", value, "nursePaymentSettingsPwd");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsPwdGreaterThan(String value) {
            addCriterion("nurse_payment_settings_pwd >", value, "nursePaymentSettingsPwd");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsPwdGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_payment_settings_pwd >=", value, "nursePaymentSettingsPwd");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsPwdLessThan(String value) {
            addCriterion("nurse_payment_settings_pwd <", value, "nursePaymentSettingsPwd");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsPwdLessThanOrEqualTo(String value) {
            addCriterion("nurse_payment_settings_pwd <=", value, "nursePaymentSettingsPwd");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsPwdLike(String value) {
            addCriterion("nurse_payment_settings_pwd like", value, "nursePaymentSettingsPwd");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsPwdNotLike(String value) {
            addCriterion("nurse_payment_settings_pwd not like", value, "nursePaymentSettingsPwd");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsPwdIn(List<String> values) {
            addCriterion("nurse_payment_settings_pwd in", values, "nursePaymentSettingsPwd");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsPwdNotIn(List<String> values) {
            addCriterion("nurse_payment_settings_pwd not in", values, "nursePaymentSettingsPwd");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsPwdBetween(String value1, String value2) {
            addCriterion("nurse_payment_settings_pwd between", value1, value2, "nursePaymentSettingsPwd");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsPwdNotBetween(String value1, String value2) {
            addCriterion("nurse_payment_settings_pwd not between", value1, value2, "nursePaymentSettingsPwd");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsAccountIsNull() {
            addCriterion("nurse_payment_settings_account is null");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsAccountIsNotNull() {
            addCriterion("nurse_payment_settings_account is not null");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsAccountEqualTo(String value) {
            addCriterion("nurse_payment_settings_account =", value, "nursePaymentSettingsAccount");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsAccountNotEqualTo(String value) {
            addCriterion("nurse_payment_settings_account <>", value, "nursePaymentSettingsAccount");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsAccountGreaterThan(String value) {
            addCriterion("nurse_payment_settings_account >", value, "nursePaymentSettingsAccount");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsAccountGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_payment_settings_account >=", value, "nursePaymentSettingsAccount");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsAccountLessThan(String value) {
            addCriterion("nurse_payment_settings_account <", value, "nursePaymentSettingsAccount");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsAccountLessThanOrEqualTo(String value) {
            addCriterion("nurse_payment_settings_account <=", value, "nursePaymentSettingsAccount");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsAccountLike(String value) {
            addCriterion("nurse_payment_settings_account like", value, "nursePaymentSettingsAccount");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsAccountNotLike(String value) {
            addCriterion("nurse_payment_settings_account not like", value, "nursePaymentSettingsAccount");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsAccountIn(List<String> values) {
            addCriterion("nurse_payment_settings_account in", values, "nursePaymentSettingsAccount");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsAccountNotIn(List<String> values) {
            addCriterion("nurse_payment_settings_account not in", values, "nursePaymentSettingsAccount");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsAccountBetween(String value1, String value2) {
            addCriterion("nurse_payment_settings_account between", value1, value2, "nursePaymentSettingsAccount");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsAccountNotBetween(String value1, String value2) {
            addCriterion("nurse_payment_settings_account not between", value1, value2, "nursePaymentSettingsAccount");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOveroneIsNull() {
            addCriterion("nurse_payment_settings_overone is null");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOveroneIsNotNull() {
            addCriterion("nurse_payment_settings_overone is not null");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOveroneEqualTo(String value) {
            addCriterion("nurse_payment_settings_overone =", value, "nursePaymentSettingsOverone");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOveroneNotEqualTo(String value) {
            addCriterion("nurse_payment_settings_overone <>", value, "nursePaymentSettingsOverone");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOveroneGreaterThan(String value) {
            addCriterion("nurse_payment_settings_overone >", value, "nursePaymentSettingsOverone");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOveroneGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_payment_settings_overone >=", value, "nursePaymentSettingsOverone");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOveroneLessThan(String value) {
            addCriterion("nurse_payment_settings_overone <", value, "nursePaymentSettingsOverone");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOveroneLessThanOrEqualTo(String value) {
            addCriterion("nurse_payment_settings_overone <=", value, "nursePaymentSettingsOverone");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOveroneLike(String value) {
            addCriterion("nurse_payment_settings_overone like", value, "nursePaymentSettingsOverone");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOveroneNotLike(String value) {
            addCriterion("nurse_payment_settings_overone not like", value, "nursePaymentSettingsOverone");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOveroneIn(List<String> values) {
            addCriterion("nurse_payment_settings_overone in", values, "nursePaymentSettingsOverone");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOveroneNotIn(List<String> values) {
            addCriterion("nurse_payment_settings_overone not in", values, "nursePaymentSettingsOverone");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOveroneBetween(String value1, String value2) {
            addCriterion("nurse_payment_settings_overone between", value1, value2, "nursePaymentSettingsOverone");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOveroneNotBetween(String value1, String value2) {
            addCriterion("nurse_payment_settings_overone not between", value1, value2, "nursePaymentSettingsOverone");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOvertwoIsNull() {
            addCriterion("nurse_payment_settings_overtwo is null");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOvertwoIsNotNull() {
            addCriterion("nurse_payment_settings_overtwo is not null");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOvertwoEqualTo(String value) {
            addCriterion("nurse_payment_settings_overtwo =", value, "nursePaymentSettingsOvertwo");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOvertwoNotEqualTo(String value) {
            addCriterion("nurse_payment_settings_overtwo <>", value, "nursePaymentSettingsOvertwo");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOvertwoGreaterThan(String value) {
            addCriterion("nurse_payment_settings_overtwo >", value, "nursePaymentSettingsOvertwo");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOvertwoGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_payment_settings_overtwo >=", value, "nursePaymentSettingsOvertwo");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOvertwoLessThan(String value) {
            addCriterion("nurse_payment_settings_overtwo <", value, "nursePaymentSettingsOvertwo");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOvertwoLessThanOrEqualTo(String value) {
            addCriterion("nurse_payment_settings_overtwo <=", value, "nursePaymentSettingsOvertwo");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOvertwoLike(String value) {
            addCriterion("nurse_payment_settings_overtwo like", value, "nursePaymentSettingsOvertwo");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOvertwoNotLike(String value) {
            addCriterion("nurse_payment_settings_overtwo not like", value, "nursePaymentSettingsOvertwo");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOvertwoIn(List<String> values) {
            addCriterion("nurse_payment_settings_overtwo in", values, "nursePaymentSettingsOvertwo");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOvertwoNotIn(List<String> values) {
            addCriterion("nurse_payment_settings_overtwo not in", values, "nursePaymentSettingsOvertwo");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOvertwoBetween(String value1, String value2) {
            addCriterion("nurse_payment_settings_overtwo between", value1, value2, "nursePaymentSettingsOvertwo");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsOvertwoNotBetween(String value1, String value2) {
            addCriterion("nurse_payment_settings_overtwo not between", value1, value2, "nursePaymentSettingsOvertwo");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsCreatetimeIsNull() {
            addCriterion("nurse_payment_settings_createtime is null");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsCreatetimeIsNotNull() {
            addCriterion("nurse_payment_settings_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsCreatetimeEqualTo(Date value) {
            addCriterion("nurse_payment_settings_createtime =", value, "nursePaymentSettingsCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsCreatetimeNotEqualTo(Date value) {
            addCriterion("nurse_payment_settings_createtime <>", value, "nursePaymentSettingsCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsCreatetimeGreaterThan(Date value) {
            addCriterion("nurse_payment_settings_createtime >", value, "nursePaymentSettingsCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nurse_payment_settings_createtime >=", value, "nursePaymentSettingsCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsCreatetimeLessThan(Date value) {
            addCriterion("nurse_payment_settings_createtime <", value, "nursePaymentSettingsCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("nurse_payment_settings_createtime <=", value, "nursePaymentSettingsCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsCreatetimeIn(List<Date> values) {
            addCriterion("nurse_payment_settings_createtime in", values, "nursePaymentSettingsCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsCreatetimeNotIn(List<Date> values) {
            addCriterion("nurse_payment_settings_createtime not in", values, "nursePaymentSettingsCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsCreatetimeBetween(Date value1, Date value2) {
            addCriterion("nurse_payment_settings_createtime between", value1, value2, "nursePaymentSettingsCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursePaymentSettingsCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("nurse_payment_settings_createtime not between", value1, value2, "nursePaymentSettingsCreatetime");
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