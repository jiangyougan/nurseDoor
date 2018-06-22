package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManageNursingTestallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManageNursingTestallExample() {
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

        public Criteria andManageNursingTestallIsNull() {
            addCriterion("manage_nursing_testall is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallIsNotNull() {
            addCriterion("manage_nursing_testall is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallEqualTo(String value) {
            addCriterion("manage_nursing_testall =", value, "manageNursingTestall");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNotEqualTo(String value) {
            addCriterion("manage_nursing_testall <>", value, "manageNursingTestall");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallGreaterThan(String value) {
            addCriterion("manage_nursing_testall >", value, "manageNursingTestall");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_testall >=", value, "manageNursingTestall");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallLessThan(String value) {
            addCriterion("manage_nursing_testall <", value, "manageNursingTestall");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_testall <=", value, "manageNursingTestall");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallLike(String value) {
            addCriterion("manage_nursing_testall like", value, "manageNursingTestall");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNotLike(String value) {
            addCriterion("manage_nursing_testall not like", value, "manageNursingTestall");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallIn(List<String> values) {
            addCriterion("manage_nursing_testall in", values, "manageNursingTestall");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNotIn(List<String> values) {
            addCriterion("manage_nursing_testall not in", values, "manageNursingTestall");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallBetween(String value1, String value2) {
            addCriterion("manage_nursing_testall between", value1, value2, "manageNursingTestall");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_testall not between", value1, value2, "manageNursingTestall");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNameIsNull() {
            addCriterion("manage_nursing_testall_name is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNameIsNotNull() {
            addCriterion("manage_nursing_testall_name is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNameEqualTo(String value) {
            addCriterion("manage_nursing_testall_name =", value, "manageNursingTestallName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNameNotEqualTo(String value) {
            addCriterion("manage_nursing_testall_name <>", value, "manageNursingTestallName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNameGreaterThan(String value) {
            addCriterion("manage_nursing_testall_name >", value, "manageNursingTestallName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNameGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_testall_name >=", value, "manageNursingTestallName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNameLessThan(String value) {
            addCriterion("manage_nursing_testall_name <", value, "manageNursingTestallName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNameLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_testall_name <=", value, "manageNursingTestallName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNameLike(String value) {
            addCriterion("manage_nursing_testall_name like", value, "manageNursingTestallName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNameNotLike(String value) {
            addCriterion("manage_nursing_testall_name not like", value, "manageNursingTestallName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNameIn(List<String> values) {
            addCriterion("manage_nursing_testall_name in", values, "manageNursingTestallName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNameNotIn(List<String> values) {
            addCriterion("manage_nursing_testall_name not in", values, "manageNursingTestallName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNameBetween(String value1, String value2) {
            addCriterion("manage_nursing_testall_name between", value1, value2, "manageNursingTestallName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallNameNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_testall_name not between", value1, value2, "manageNursingTestallName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallUnitIsNull() {
            addCriterion("manage_nursing_testall_unit is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallUnitIsNotNull() {
            addCriterion("manage_nursing_testall_unit is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallUnitEqualTo(String value) {
            addCriterion("manage_nursing_testall_unit =", value, "manageNursingTestallUnit");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallUnitNotEqualTo(String value) {
            addCriterion("manage_nursing_testall_unit <>", value, "manageNursingTestallUnit");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallUnitGreaterThan(String value) {
            addCriterion("manage_nursing_testall_unit >", value, "manageNursingTestallUnit");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallUnitGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_testall_unit >=", value, "manageNursingTestallUnit");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallUnitLessThan(String value) {
            addCriterion("manage_nursing_testall_unit <", value, "manageNursingTestallUnit");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallUnitLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_testall_unit <=", value, "manageNursingTestallUnit");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallUnitLike(String value) {
            addCriterion("manage_nursing_testall_unit like", value, "manageNursingTestallUnit");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallUnitNotLike(String value) {
            addCriterion("manage_nursing_testall_unit not like", value, "manageNursingTestallUnit");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallUnitIn(List<String> values) {
            addCriterion("manage_nursing_testall_unit in", values, "manageNursingTestallUnit");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallUnitNotIn(List<String> values) {
            addCriterion("manage_nursing_testall_unit not in", values, "manageNursingTestallUnit");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallUnitBetween(String value1, String value2) {
            addCriterion("manage_nursing_testall_unit between", value1, value2, "manageNursingTestallUnit");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallUnitNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_testall_unit not between", value1, value2, "manageNursingTestallUnit");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreateridIsNull() {
            addCriterion("manage_nursing_testall_createrid is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreateridIsNotNull() {
            addCriterion("manage_nursing_testall_createrid is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreateridEqualTo(String value) {
            addCriterion("manage_nursing_testall_createrid =", value, "manageNursingTestallCreaterid");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreateridNotEqualTo(String value) {
            addCriterion("manage_nursing_testall_createrid <>", value, "manageNursingTestallCreaterid");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreateridGreaterThan(String value) {
            addCriterion("manage_nursing_testall_createrid >", value, "manageNursingTestallCreaterid");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreateridGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_testall_createrid >=", value, "manageNursingTestallCreaterid");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreateridLessThan(String value) {
            addCriterion("manage_nursing_testall_createrid <", value, "manageNursingTestallCreaterid");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreateridLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_testall_createrid <=", value, "manageNursingTestallCreaterid");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreateridLike(String value) {
            addCriterion("manage_nursing_testall_createrid like", value, "manageNursingTestallCreaterid");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreateridNotLike(String value) {
            addCriterion("manage_nursing_testall_createrid not like", value, "manageNursingTestallCreaterid");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreateridIn(List<String> values) {
            addCriterion("manage_nursing_testall_createrid in", values, "manageNursingTestallCreaterid");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreateridNotIn(List<String> values) {
            addCriterion("manage_nursing_testall_createrid not in", values, "manageNursingTestallCreaterid");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreateridBetween(String value1, String value2) {
            addCriterion("manage_nursing_testall_createrid between", value1, value2, "manageNursingTestallCreaterid");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreateridNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_testall_createrid not between", value1, value2, "manageNursingTestallCreaterid");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreatetimeIsNull() {
            addCriterion("manage_nursing_testall_createtime is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreatetimeIsNotNull() {
            addCriterion("manage_nursing_testall_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreatetimeEqualTo(Date value) {
            addCriterion("manage_nursing_testall_createtime =", value, "manageNursingTestallCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreatetimeNotEqualTo(Date value) {
            addCriterion("manage_nursing_testall_createtime <>", value, "manageNursingTestallCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreatetimeGreaterThan(Date value) {
            addCriterion("manage_nursing_testall_createtime >", value, "manageNursingTestallCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("manage_nursing_testall_createtime >=", value, "manageNursingTestallCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreatetimeLessThan(Date value) {
            addCriterion("manage_nursing_testall_createtime <", value, "manageNursingTestallCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("manage_nursing_testall_createtime <=", value, "manageNursingTestallCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreatetimeIn(List<Date> values) {
            addCriterion("manage_nursing_testall_createtime in", values, "manageNursingTestallCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreatetimeNotIn(List<Date> values) {
            addCriterion("manage_nursing_testall_createtime not in", values, "manageNursingTestallCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreatetimeBetween(Date value1, Date value2) {
            addCriterion("manage_nursing_testall_createtime between", value1, value2, "manageNursingTestallCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestallCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("manage_nursing_testall_createtime not between", value1, value2, "manageNursingTestallCreatetime");
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