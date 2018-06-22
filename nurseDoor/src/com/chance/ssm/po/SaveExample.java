package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaveExample() {
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

        public Criteria andSaveIdIsNull() {
            addCriterion("save_id is null");
            return (Criteria) this;
        }

        public Criteria andSaveIdIsNotNull() {
            addCriterion("save_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaveIdEqualTo(String value) {
            addCriterion("save_id =", value, "saveId");
            return (Criteria) this;
        }

        public Criteria andSaveIdNotEqualTo(String value) {
            addCriterion("save_id <>", value, "saveId");
            return (Criteria) this;
        }

        public Criteria andSaveIdGreaterThan(String value) {
            addCriterion("save_id >", value, "saveId");
            return (Criteria) this;
        }

        public Criteria andSaveIdGreaterThanOrEqualTo(String value) {
            addCriterion("save_id >=", value, "saveId");
            return (Criteria) this;
        }

        public Criteria andSaveIdLessThan(String value) {
            addCriterion("save_id <", value, "saveId");
            return (Criteria) this;
        }

        public Criteria andSaveIdLessThanOrEqualTo(String value) {
            addCriterion("save_id <=", value, "saveId");
            return (Criteria) this;
        }

        public Criteria andSaveIdLike(String value) {
            addCriterion("save_id like", value, "saveId");
            return (Criteria) this;
        }

        public Criteria andSaveIdNotLike(String value) {
            addCriterion("save_id not like", value, "saveId");
            return (Criteria) this;
        }

        public Criteria andSaveIdIn(List<String> values) {
            addCriterion("save_id in", values, "saveId");
            return (Criteria) this;
        }

        public Criteria andSaveIdNotIn(List<String> values) {
            addCriterion("save_id not in", values, "saveId");
            return (Criteria) this;
        }

        public Criteria andSaveIdBetween(String value1, String value2) {
            addCriterion("save_id between", value1, value2, "saveId");
            return (Criteria) this;
        }

        public Criteria andSaveIdNotBetween(String value1, String value2) {
            addCriterion("save_id not between", value1, value2, "saveId");
            return (Criteria) this;
        }

        public Criteria andSaveCostIsNull() {
            addCriterion("save_cost is null");
            return (Criteria) this;
        }

        public Criteria andSaveCostIsNotNull() {
            addCriterion("save_cost is not null");
            return (Criteria) this;
        }

        public Criteria andSaveCostEqualTo(BigDecimal value) {
            addCriterion("save_cost =", value, "saveCost");
            return (Criteria) this;
        }

        public Criteria andSaveCostNotEqualTo(BigDecimal value) {
            addCriterion("save_cost <>", value, "saveCost");
            return (Criteria) this;
        }

        public Criteria andSaveCostGreaterThan(BigDecimal value) {
            addCriterion("save_cost >", value, "saveCost");
            return (Criteria) this;
        }

        public Criteria andSaveCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("save_cost >=", value, "saveCost");
            return (Criteria) this;
        }

        public Criteria andSaveCostLessThan(BigDecimal value) {
            addCriterion("save_cost <", value, "saveCost");
            return (Criteria) this;
        }

        public Criteria andSaveCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("save_cost <=", value, "saveCost");
            return (Criteria) this;
        }

        public Criteria andSaveCostIn(List<BigDecimal> values) {
            addCriterion("save_cost in", values, "saveCost");
            return (Criteria) this;
        }

        public Criteria andSaveCostNotIn(List<BigDecimal> values) {
            addCriterion("save_cost not in", values, "saveCost");
            return (Criteria) this;
        }

        public Criteria andSaveCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("save_cost between", value1, value2, "saveCost");
            return (Criteria) this;
        }

        public Criteria andSaveCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("save_cost not between", value1, value2, "saveCost");
            return (Criteria) this;
        }

        public Criteria andSaveCreateterIsNull() {
            addCriterion("save_createter is null");
            return (Criteria) this;
        }

        public Criteria andSaveCreateterIsNotNull() {
            addCriterion("save_createter is not null");
            return (Criteria) this;
        }

        public Criteria andSaveCreateterEqualTo(String value) {
            addCriterion("save_createter =", value, "saveCreateter");
            return (Criteria) this;
        }

        public Criteria andSaveCreateterNotEqualTo(String value) {
            addCriterion("save_createter <>", value, "saveCreateter");
            return (Criteria) this;
        }

        public Criteria andSaveCreateterGreaterThan(String value) {
            addCriterion("save_createter >", value, "saveCreateter");
            return (Criteria) this;
        }

        public Criteria andSaveCreateterGreaterThanOrEqualTo(String value) {
            addCriterion("save_createter >=", value, "saveCreateter");
            return (Criteria) this;
        }

        public Criteria andSaveCreateterLessThan(String value) {
            addCriterion("save_createter <", value, "saveCreateter");
            return (Criteria) this;
        }

        public Criteria andSaveCreateterLessThanOrEqualTo(String value) {
            addCriterion("save_createter <=", value, "saveCreateter");
            return (Criteria) this;
        }

        public Criteria andSaveCreateterLike(String value) {
            addCriterion("save_createter like", value, "saveCreateter");
            return (Criteria) this;
        }

        public Criteria andSaveCreateterNotLike(String value) {
            addCriterion("save_createter not like", value, "saveCreateter");
            return (Criteria) this;
        }

        public Criteria andSaveCreateterIn(List<String> values) {
            addCriterion("save_createter in", values, "saveCreateter");
            return (Criteria) this;
        }

        public Criteria andSaveCreateterNotIn(List<String> values) {
            addCriterion("save_createter not in", values, "saveCreateter");
            return (Criteria) this;
        }

        public Criteria andSaveCreateterBetween(String value1, String value2) {
            addCriterion("save_createter between", value1, value2, "saveCreateter");
            return (Criteria) this;
        }

        public Criteria andSaveCreateterNotBetween(String value1, String value2) {
            addCriterion("save_createter not between", value1, value2, "saveCreateter");
            return (Criteria) this;
        }

        public Criteria andSaveCreatetimeIsNull() {
            addCriterion("save_createtime is null");
            return (Criteria) this;
        }

        public Criteria andSaveCreatetimeIsNotNull() {
            addCriterion("save_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andSaveCreatetimeEqualTo(Date value) {
            addCriterion("save_createtime =", value, "saveCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaveCreatetimeNotEqualTo(Date value) {
            addCriterion("save_createtime <>", value, "saveCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaveCreatetimeGreaterThan(Date value) {
            addCriterion("save_createtime >", value, "saveCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaveCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("save_createtime >=", value, "saveCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaveCreatetimeLessThan(Date value) {
            addCriterion("save_createtime <", value, "saveCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaveCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("save_createtime <=", value, "saveCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaveCreatetimeIn(List<Date> values) {
            addCriterion("save_createtime in", values, "saveCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaveCreatetimeNotIn(List<Date> values) {
            addCriterion("save_createtime not in", values, "saveCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaveCreatetimeBetween(Date value1, Date value2) {
            addCriterion("save_createtime between", value1, value2, "saveCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaveCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("save_createtime not between", value1, value2, "saveCreatetime");
            return (Criteria) this;
        }

        public Criteria andSaveUpdatetimeIsNull() {
            addCriterion("save_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andSaveUpdatetimeIsNotNull() {
            addCriterion("save_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andSaveUpdatetimeEqualTo(Date value) {
            addCriterion("save_updatetime =", value, "saveUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSaveUpdatetimeNotEqualTo(Date value) {
            addCriterion("save_updatetime <>", value, "saveUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSaveUpdatetimeGreaterThan(Date value) {
            addCriterion("save_updatetime >", value, "saveUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSaveUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("save_updatetime >=", value, "saveUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSaveUpdatetimeLessThan(Date value) {
            addCriterion("save_updatetime <", value, "saveUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSaveUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("save_updatetime <=", value, "saveUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSaveUpdatetimeIn(List<Date> values) {
            addCriterion("save_updatetime in", values, "saveUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSaveUpdatetimeNotIn(List<Date> values) {
            addCriterion("save_updatetime not in", values, "saveUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSaveUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("save_updatetime between", value1, value2, "saveUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSaveUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("save_updatetime not between", value1, value2, "saveUpdatetime");
            return (Criteria) this;
        }

        public Criteria andSaveNameIsNull() {
            addCriterion("save_name is null");
            return (Criteria) this;
        }

        public Criteria andSaveNameIsNotNull() {
            addCriterion("save_name is not null");
            return (Criteria) this;
        }

        public Criteria andSaveNameEqualTo(String value) {
            addCriterion("save_name =", value, "saveName");
            return (Criteria) this;
        }

        public Criteria andSaveNameNotEqualTo(String value) {
            addCriterion("save_name <>", value, "saveName");
            return (Criteria) this;
        }

        public Criteria andSaveNameGreaterThan(String value) {
            addCriterion("save_name >", value, "saveName");
            return (Criteria) this;
        }

        public Criteria andSaveNameGreaterThanOrEqualTo(String value) {
            addCriterion("save_name >=", value, "saveName");
            return (Criteria) this;
        }

        public Criteria andSaveNameLessThan(String value) {
            addCriterion("save_name <", value, "saveName");
            return (Criteria) this;
        }

        public Criteria andSaveNameLessThanOrEqualTo(String value) {
            addCriterion("save_name <=", value, "saveName");
            return (Criteria) this;
        }

        public Criteria andSaveNameLike(String value) {
            addCriterion("save_name like", value, "saveName");
            return (Criteria) this;
        }

        public Criteria andSaveNameNotLike(String value) {
            addCriterion("save_name not like", value, "saveName");
            return (Criteria) this;
        }

        public Criteria andSaveNameIn(List<String> values) {
            addCriterion("save_name in", values, "saveName");
            return (Criteria) this;
        }

        public Criteria andSaveNameNotIn(List<String> values) {
            addCriterion("save_name not in", values, "saveName");
            return (Criteria) this;
        }

        public Criteria andSaveNameBetween(String value1, String value2) {
            addCriterion("save_name between", value1, value2, "saveName");
            return (Criteria) this;
        }

        public Criteria andSaveNameNotBetween(String value1, String value2) {
            addCriterion("save_name not between", value1, value2, "saveName");
            return (Criteria) this;
        }

        public Criteria andSaveLogoIsNull() {
            addCriterion("save_logo is null");
            return (Criteria) this;
        }

        public Criteria andSaveLogoIsNotNull() {
            addCriterion("save_logo is not null");
            return (Criteria) this;
        }

        public Criteria andSaveLogoEqualTo(String value) {
            addCriterion("save_logo =", value, "saveLogo");
            return (Criteria) this;
        }

        public Criteria andSaveLogoNotEqualTo(String value) {
            addCriterion("save_logo <>", value, "saveLogo");
            return (Criteria) this;
        }

        public Criteria andSaveLogoGreaterThan(String value) {
            addCriterion("save_logo >", value, "saveLogo");
            return (Criteria) this;
        }

        public Criteria andSaveLogoGreaterThanOrEqualTo(String value) {
            addCriterion("save_logo >=", value, "saveLogo");
            return (Criteria) this;
        }

        public Criteria andSaveLogoLessThan(String value) {
            addCriterion("save_logo <", value, "saveLogo");
            return (Criteria) this;
        }

        public Criteria andSaveLogoLessThanOrEqualTo(String value) {
            addCriterion("save_logo <=", value, "saveLogo");
            return (Criteria) this;
        }

        public Criteria andSaveLogoLike(String value) {
            addCriterion("save_logo like", value, "saveLogo");
            return (Criteria) this;
        }

        public Criteria andSaveLogoNotLike(String value) {
            addCriterion("save_logo not like", value, "saveLogo");
            return (Criteria) this;
        }

        public Criteria andSaveLogoIn(List<String> values) {
            addCriterion("save_logo in", values, "saveLogo");
            return (Criteria) this;
        }

        public Criteria andSaveLogoNotIn(List<String> values) {
            addCriterion("save_logo not in", values, "saveLogo");
            return (Criteria) this;
        }

        public Criteria andSaveLogoBetween(String value1, String value2) {
            addCriterion("save_logo between", value1, value2, "saveLogo");
            return (Criteria) this;
        }

        public Criteria andSaveLogoNotBetween(String value1, String value2) {
            addCriterion("save_logo not between", value1, value2, "saveLogo");
            return (Criteria) this;
        }

        public Criteria andSaveUrlIsNull() {
            addCriterion("save_url is null");
            return (Criteria) this;
        }

        public Criteria andSaveUrlIsNotNull() {
            addCriterion("save_url is not null");
            return (Criteria) this;
        }

        public Criteria andSaveUrlEqualTo(String value) {
            addCriterion("save_url =", value, "saveUrl");
            return (Criteria) this;
        }

        public Criteria andSaveUrlNotEqualTo(String value) {
            addCriterion("save_url <>", value, "saveUrl");
            return (Criteria) this;
        }

        public Criteria andSaveUrlGreaterThan(String value) {
            addCriterion("save_url >", value, "saveUrl");
            return (Criteria) this;
        }

        public Criteria andSaveUrlGreaterThanOrEqualTo(String value) {
            addCriterion("save_url >=", value, "saveUrl");
            return (Criteria) this;
        }

        public Criteria andSaveUrlLessThan(String value) {
            addCriterion("save_url <", value, "saveUrl");
            return (Criteria) this;
        }

        public Criteria andSaveUrlLessThanOrEqualTo(String value) {
            addCriterion("save_url <=", value, "saveUrl");
            return (Criteria) this;
        }

        public Criteria andSaveUrlLike(String value) {
            addCriterion("save_url like", value, "saveUrl");
            return (Criteria) this;
        }

        public Criteria andSaveUrlNotLike(String value) {
            addCriterion("save_url not like", value, "saveUrl");
            return (Criteria) this;
        }

        public Criteria andSaveUrlIn(List<String> values) {
            addCriterion("save_url in", values, "saveUrl");
            return (Criteria) this;
        }

        public Criteria andSaveUrlNotIn(List<String> values) {
            addCriterion("save_url not in", values, "saveUrl");
            return (Criteria) this;
        }

        public Criteria andSaveUrlBetween(String value1, String value2) {
            addCriterion("save_url between", value1, value2, "saveUrl");
            return (Criteria) this;
        }

        public Criteria andSaveUrlNotBetween(String value1, String value2) {
            addCriterion("save_url not between", value1, value2, "saveUrl");
            return (Criteria) this;
        }

        public Criteria andSaveInfoIsNull() {
            addCriterion("save_info is null");
            return (Criteria) this;
        }

        public Criteria andSaveInfoIsNotNull() {
            addCriterion("save_info is not null");
            return (Criteria) this;
        }

        public Criteria andSaveInfoEqualTo(String value) {
            addCriterion("save_info =", value, "saveInfo");
            return (Criteria) this;
        }

        public Criteria andSaveInfoNotEqualTo(String value) {
            addCriterion("save_info <>", value, "saveInfo");
            return (Criteria) this;
        }

        public Criteria andSaveInfoGreaterThan(String value) {
            addCriterion("save_info >", value, "saveInfo");
            return (Criteria) this;
        }

        public Criteria andSaveInfoGreaterThanOrEqualTo(String value) {
            addCriterion("save_info >=", value, "saveInfo");
            return (Criteria) this;
        }

        public Criteria andSaveInfoLessThan(String value) {
            addCriterion("save_info <", value, "saveInfo");
            return (Criteria) this;
        }

        public Criteria andSaveInfoLessThanOrEqualTo(String value) {
            addCriterion("save_info <=", value, "saveInfo");
            return (Criteria) this;
        }

        public Criteria andSaveInfoLike(String value) {
            addCriterion("save_info like", value, "saveInfo");
            return (Criteria) this;
        }

        public Criteria andSaveInfoNotLike(String value) {
            addCriterion("save_info not like", value, "saveInfo");
            return (Criteria) this;
        }

        public Criteria andSaveInfoIn(List<String> values) {
            addCriterion("save_info in", values, "saveInfo");
            return (Criteria) this;
        }

        public Criteria andSaveInfoNotIn(List<String> values) {
            addCriterion("save_info not in", values, "saveInfo");
            return (Criteria) this;
        }

        public Criteria andSaveInfoBetween(String value1, String value2) {
            addCriterion("save_info between", value1, value2, "saveInfo");
            return (Criteria) this;
        }

        public Criteria andSaveInfoNotBetween(String value1, String value2) {
            addCriterion("save_info not between", value1, value2, "saveInfo");
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