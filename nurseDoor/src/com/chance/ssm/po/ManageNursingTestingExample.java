package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManageNursingTestingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManageNursingTestingExample() {
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

        public Criteria andManageNursingTestingIdIsNull() {
            addCriterion("manage_nursing_testing_id is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingIdIsNotNull() {
            addCriterion("manage_nursing_testing_id is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingIdEqualTo(String value) {
            addCriterion("manage_nursing_testing_id =", value, "manageNursingTestingId");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingIdNotEqualTo(String value) {
            addCriterion("manage_nursing_testing_id <>", value, "manageNursingTestingId");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingIdGreaterThan(String value) {
            addCriterion("manage_nursing_testing_id >", value, "manageNursingTestingId");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingIdGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_testing_id >=", value, "manageNursingTestingId");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingIdLessThan(String value) {
            addCriterion("manage_nursing_testing_id <", value, "manageNursingTestingId");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingIdLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_testing_id <=", value, "manageNursingTestingId");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingIdLike(String value) {
            addCriterion("manage_nursing_testing_id like", value, "manageNursingTestingId");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingIdNotLike(String value) {
            addCriterion("manage_nursing_testing_id not like", value, "manageNursingTestingId");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingIdIn(List<String> values) {
            addCriterion("manage_nursing_testing_id in", values, "manageNursingTestingId");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingIdNotIn(List<String> values) {
            addCriterion("manage_nursing_testing_id not in", values, "manageNursingTestingId");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingIdBetween(String value1, String value2) {
            addCriterion("manage_nursing_testing_id between", value1, value2, "manageNursingTestingId");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingIdNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_testing_id not between", value1, value2, "manageNursingTestingId");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingMacontentIsNull() {
            addCriterion("manage_nursing_testing_macontent is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingMacontentIsNotNull() {
            addCriterion("manage_nursing_testing_macontent is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingMacontentEqualTo(String value) {
            addCriterion("manage_nursing_testing_macontent =", value, "manageNursingTestingMacontent");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingMacontentNotEqualTo(String value) {
            addCriterion("manage_nursing_testing_macontent <>", value, "manageNursingTestingMacontent");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingMacontentGreaterThan(String value) {
            addCriterion("manage_nursing_testing_macontent >", value, "manageNursingTestingMacontent");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingMacontentGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_testing_macontent >=", value, "manageNursingTestingMacontent");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingMacontentLessThan(String value) {
            addCriterion("manage_nursing_testing_macontent <", value, "manageNursingTestingMacontent");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingMacontentLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_testing_macontent <=", value, "manageNursingTestingMacontent");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingMacontentLike(String value) {
            addCriterion("manage_nursing_testing_macontent like", value, "manageNursingTestingMacontent");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingMacontentNotLike(String value) {
            addCriterion("manage_nursing_testing_macontent not like", value, "manageNursingTestingMacontent");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingMacontentIn(List<String> values) {
            addCriterion("manage_nursing_testing_macontent in", values, "manageNursingTestingMacontent");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingMacontentNotIn(List<String> values) {
            addCriterion("manage_nursing_testing_macontent not in", values, "manageNursingTestingMacontent");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingMacontentBetween(String value1, String value2) {
            addCriterion("manage_nursing_testing_macontent between", value1, value2, "manageNursingTestingMacontent");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingMacontentNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_testing_macontent not between", value1, value2, "manageNursingTestingMacontent");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingNameIsNull() {
            addCriterion("manage_nursing_testing_name is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingNameIsNotNull() {
            addCriterion("manage_nursing_testing_name is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingNameEqualTo(String value) {
            addCriterion("manage_nursing_testing_name =", value, "manageNursingTestingName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingNameNotEqualTo(String value) {
            addCriterion("manage_nursing_testing_name <>", value, "manageNursingTestingName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingNameGreaterThan(String value) {
            addCriterion("manage_nursing_testing_name >", value, "manageNursingTestingName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingNameGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_testing_name >=", value, "manageNursingTestingName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingNameLessThan(String value) {
            addCriterion("manage_nursing_testing_name <", value, "manageNursingTestingName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingNameLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_testing_name <=", value, "manageNursingTestingName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingNameLike(String value) {
            addCriterion("manage_nursing_testing_name like", value, "manageNursingTestingName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingNameNotLike(String value) {
            addCriterion("manage_nursing_testing_name not like", value, "manageNursingTestingName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingNameIn(List<String> values) {
            addCriterion("manage_nursing_testing_name in", values, "manageNursingTestingName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingNameNotIn(List<String> values) {
            addCriterion("manage_nursing_testing_name not in", values, "manageNursingTestingName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingNameBetween(String value1, String value2) {
            addCriterion("manage_nursing_testing_name between", value1, value2, "manageNursingTestingName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingNameNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_testing_name not between", value1, value2, "manageNursingTestingName");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreatetimeIsNull() {
            addCriterion("manage_nursing_testing_createtime is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreatetimeIsNotNull() {
            addCriterion("manage_nursing_testing_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreatetimeEqualTo(String value) {
            addCriterion("manage_nursing_testing_createtime =", value, "manageNursingTestingCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreatetimeNotEqualTo(String value) {
            addCriterion("manage_nursing_testing_createtime <>", value, "manageNursingTestingCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreatetimeGreaterThan(String value) {
            addCriterion("manage_nursing_testing_createtime >", value, "manageNursingTestingCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("manage_nursing_testing_createtime >=", value, "manageNursingTestingCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreatetimeLessThan(String value) {
            addCriterion("manage_nursing_testing_createtime <", value, "manageNursingTestingCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("manage_nursing_testing_createtime <=", value, "manageNursingTestingCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreatetimeLike(String value) {
            addCriterion("manage_nursing_testing_createtime like", value, "manageNursingTestingCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreatetimeNotLike(String value) {
            addCriterion("manage_nursing_testing_createtime not like", value, "manageNursingTestingCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreatetimeIn(List<String> values) {
            addCriterion("manage_nursing_testing_createtime in", values, "manageNursingTestingCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreatetimeNotIn(List<String> values) {
            addCriterion("manage_nursing_testing_createtime not in", values, "manageNursingTestingCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreatetimeBetween(String value1, String value2) {
            addCriterion("manage_nursing_testing_createtime between", value1, value2, "manageNursingTestingCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreatetimeNotBetween(String value1, String value2) {
            addCriterion("manage_nursing_testing_createtime not between", value1, value2, "manageNursingTestingCreatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreateterIsNull() {
            addCriterion("manage_nursing_testing_createter is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreateterIsNotNull() {
            addCriterion("manage_nursing_testing_createter is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreateterEqualTo(Date value) {
            addCriterion("manage_nursing_testing_createter =", value, "manageNursingTestingCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreateterNotEqualTo(Date value) {
            addCriterion("manage_nursing_testing_createter <>", value, "manageNursingTestingCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreateterGreaterThan(Date value) {
            addCriterion("manage_nursing_testing_createter >", value, "manageNursingTestingCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreateterGreaterThanOrEqualTo(Date value) {
            addCriterion("manage_nursing_testing_createter >=", value, "manageNursingTestingCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreateterLessThan(Date value) {
            addCriterion("manage_nursing_testing_createter <", value, "manageNursingTestingCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreateterLessThanOrEqualTo(Date value) {
            addCriterion("manage_nursing_testing_createter <=", value, "manageNursingTestingCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreateterIn(List<Date> values) {
            addCriterion("manage_nursing_testing_createter in", values, "manageNursingTestingCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreateterNotIn(List<Date> values) {
            addCriterion("manage_nursing_testing_createter not in", values, "manageNursingTestingCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreateterBetween(Date value1, Date value2) {
            addCriterion("manage_nursing_testing_createter between", value1, value2, "manageNursingTestingCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingCreateterNotBetween(Date value1, Date value2) {
            addCriterion("manage_nursing_testing_createter not between", value1, value2, "manageNursingTestingCreateter");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingUpdatetimeIsNull() {
            addCriterion("manage_nursing_testing_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingUpdatetimeIsNotNull() {
            addCriterion("manage_nursing_testing_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingUpdatetimeEqualTo(Date value) {
            addCriterion("manage_nursing_testing_updatetime =", value, "manageNursingTestingUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingUpdatetimeNotEqualTo(Date value) {
            addCriterion("manage_nursing_testing_updatetime <>", value, "manageNursingTestingUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingUpdatetimeGreaterThan(Date value) {
            addCriterion("manage_nursing_testing_updatetime >", value, "manageNursingTestingUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("manage_nursing_testing_updatetime >=", value, "manageNursingTestingUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingUpdatetimeLessThan(Date value) {
            addCriterion("manage_nursing_testing_updatetime <", value, "manageNursingTestingUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("manage_nursing_testing_updatetime <=", value, "manageNursingTestingUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingUpdatetimeIn(List<Date> values) {
            addCriterion("manage_nursing_testing_updatetime in", values, "manageNursingTestingUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingUpdatetimeNotIn(List<Date> values) {
            addCriterion("manage_nursing_testing_updatetime not in", values, "manageNursingTestingUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("manage_nursing_testing_updatetime between", value1, value2, "manageNursingTestingUpdatetime");
            return (Criteria) this;
        }

        public Criteria andManageNursingTestingUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("manage_nursing_testing_updatetime not between", value1, value2, "manageNursingTestingUpdatetime");
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