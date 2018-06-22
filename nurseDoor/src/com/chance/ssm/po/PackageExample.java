package com.chance.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PackageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PackageExample() {
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

        public Criteria andPackageIdIsNull() {
            addCriterion("package_id is null");
            return (Criteria) this;
        }

        public Criteria andPackageIdIsNotNull() {
            addCriterion("package_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackageIdEqualTo(String value) {
            addCriterion("package_id =", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotEqualTo(String value) {
            addCriterion("package_id <>", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdGreaterThan(String value) {
            addCriterion("package_id >", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdGreaterThanOrEqualTo(String value) {
            addCriterion("package_id >=", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdLessThan(String value) {
            addCriterion("package_id <", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdLessThanOrEqualTo(String value) {
            addCriterion("package_id <=", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdLike(String value) {
            addCriterion("package_id like", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotLike(String value) {
            addCriterion("package_id not like", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdIn(List<String> values) {
            addCriterion("package_id in", values, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotIn(List<String> values) {
            addCriterion("package_id not in", values, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdBetween(String value1, String value2) {
            addCriterion("package_id between", value1, value2, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotBetween(String value1, String value2) {
            addCriterion("package_id not between", value1, value2, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageManursingContentIsNull() {
            addCriterion("package_manursing_content is null");
            return (Criteria) this;
        }

        public Criteria andPackageManursingContentIsNotNull() {
            addCriterion("package_manursing_content is not null");
            return (Criteria) this;
        }

        public Criteria andPackageManursingContentEqualTo(String value) {
            addCriterion("package_manursing_content =", value, "packageManursingContent");
            return (Criteria) this;
        }

        public Criteria andPackageManursingContentNotEqualTo(String value) {
            addCriterion("package_manursing_content <>", value, "packageManursingContent");
            return (Criteria) this;
        }

        public Criteria andPackageManursingContentGreaterThan(String value) {
            addCriterion("package_manursing_content >", value, "packageManursingContent");
            return (Criteria) this;
        }

        public Criteria andPackageManursingContentGreaterThanOrEqualTo(String value) {
            addCriterion("package_manursing_content >=", value, "packageManursingContent");
            return (Criteria) this;
        }

        public Criteria andPackageManursingContentLessThan(String value) {
            addCriterion("package_manursing_content <", value, "packageManursingContent");
            return (Criteria) this;
        }

        public Criteria andPackageManursingContentLessThanOrEqualTo(String value) {
            addCriterion("package_manursing_content <=", value, "packageManursingContent");
            return (Criteria) this;
        }

        public Criteria andPackageManursingContentLike(String value) {
            addCriterion("package_manursing_content like", value, "packageManursingContent");
            return (Criteria) this;
        }

        public Criteria andPackageManursingContentNotLike(String value) {
            addCriterion("package_manursing_content not like", value, "packageManursingContent");
            return (Criteria) this;
        }

        public Criteria andPackageManursingContentIn(List<String> values) {
            addCriterion("package_manursing_content in", values, "packageManursingContent");
            return (Criteria) this;
        }

        public Criteria andPackageManursingContentNotIn(List<String> values) {
            addCriterion("package_manursing_content not in", values, "packageManursingContent");
            return (Criteria) this;
        }

        public Criteria andPackageManursingContentBetween(String value1, String value2) {
            addCriterion("package_manursing_content between", value1, value2, "packageManursingContent");
            return (Criteria) this;
        }

        public Criteria andPackageManursingContentNotBetween(String value1, String value2) {
            addCriterion("package_manursing_content not between", value1, value2, "packageManursingContent");
            return (Criteria) this;
        }

        public Criteria andPackage1NameIsNull() {
            addCriterion("package1_name is null");
            return (Criteria) this;
        }

        public Criteria andPackage1NameIsNotNull() {
            addCriterion("package1_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackage1NameEqualTo(String value) {
            addCriterion("package1_name =", value, "package1Name");
            return (Criteria) this;
        }

        public Criteria andPackage1NameNotEqualTo(String value) {
            addCriterion("package1_name <>", value, "package1Name");
            return (Criteria) this;
        }

        public Criteria andPackage1NameGreaterThan(String value) {
            addCriterion("package1_name >", value, "package1Name");
            return (Criteria) this;
        }

        public Criteria andPackage1NameGreaterThanOrEqualTo(String value) {
            addCriterion("package1_name >=", value, "package1Name");
            return (Criteria) this;
        }

        public Criteria andPackage1NameLessThan(String value) {
            addCriterion("package1_name <", value, "package1Name");
            return (Criteria) this;
        }

        public Criteria andPackage1NameLessThanOrEqualTo(String value) {
            addCriterion("package1_name <=", value, "package1Name");
            return (Criteria) this;
        }

        public Criteria andPackage1NameLike(String value) {
            addCriterion("package1_name like", value, "package1Name");
            return (Criteria) this;
        }

        public Criteria andPackage1NameNotLike(String value) {
            addCriterion("package1_name not like", value, "package1Name");
            return (Criteria) this;
        }

        public Criteria andPackage1NameIn(List<String> values) {
            addCriterion("package1_name in", values, "package1Name");
            return (Criteria) this;
        }

        public Criteria andPackage1NameNotIn(List<String> values) {
            addCriterion("package1_name not in", values, "package1Name");
            return (Criteria) this;
        }

        public Criteria andPackage1NameBetween(String value1, String value2) {
            addCriterion("package1_name between", value1, value2, "package1Name");
            return (Criteria) this;
        }

        public Criteria andPackage1NameNotBetween(String value1, String value2) {
            addCriterion("package1_name not between", value1, value2, "package1Name");
            return (Criteria) this;
        }

        public Criteria andPackage1CostIsNull() {
            addCriterion("package1_cost is null");
            return (Criteria) this;
        }

        public Criteria andPackage1CostIsNotNull() {
            addCriterion("package1_cost is not null");
            return (Criteria) this;
        }

        public Criteria andPackage1CostEqualTo(BigDecimal value) {
            addCriterion("package1_cost =", value, "package1Cost");
            return (Criteria) this;
        }

        public Criteria andPackage1CostNotEqualTo(BigDecimal value) {
            addCriterion("package1_cost <>", value, "package1Cost");
            return (Criteria) this;
        }

        public Criteria andPackage1CostGreaterThan(BigDecimal value) {
            addCriterion("package1_cost >", value, "package1Cost");
            return (Criteria) this;
        }

        public Criteria andPackage1CostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("package1_cost >=", value, "package1Cost");
            return (Criteria) this;
        }

        public Criteria andPackage1CostLessThan(BigDecimal value) {
            addCriterion("package1_cost <", value, "package1Cost");
            return (Criteria) this;
        }

        public Criteria andPackage1CostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("package1_cost <=", value, "package1Cost");
            return (Criteria) this;
        }

        public Criteria andPackage1CostIn(List<BigDecimal> values) {
            addCriterion("package1_cost in", values, "package1Cost");
            return (Criteria) this;
        }

        public Criteria andPackage1CostNotIn(List<BigDecimal> values) {
            addCriterion("package1_cost not in", values, "package1Cost");
            return (Criteria) this;
        }

        public Criteria andPackage1CostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package1_cost between", value1, value2, "package1Cost");
            return (Criteria) this;
        }

        public Criteria andPackage1CostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package1_cost not between", value1, value2, "package1Cost");
            return (Criteria) this;
        }

        public Criteria andPackageCreatetimeIsNull() {
            addCriterion("package_createtime is null");
            return (Criteria) this;
        }

        public Criteria andPackageCreatetimeIsNotNull() {
            addCriterion("package_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andPackageCreatetimeEqualTo(Date value) {
            addCriterion("package_createtime =", value, "packageCreatetime");
            return (Criteria) this;
        }

        public Criteria andPackageCreatetimeNotEqualTo(Date value) {
            addCriterion("package_createtime <>", value, "packageCreatetime");
            return (Criteria) this;
        }

        public Criteria andPackageCreatetimeGreaterThan(Date value) {
            addCriterion("package_createtime >", value, "packageCreatetime");
            return (Criteria) this;
        }

        public Criteria andPackageCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("package_createtime >=", value, "packageCreatetime");
            return (Criteria) this;
        }

        public Criteria andPackageCreatetimeLessThan(Date value) {
            addCriterion("package_createtime <", value, "packageCreatetime");
            return (Criteria) this;
        }

        public Criteria andPackageCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("package_createtime <=", value, "packageCreatetime");
            return (Criteria) this;
        }

        public Criteria andPackageCreatetimeIn(List<Date> values) {
            addCriterion("package_createtime in", values, "packageCreatetime");
            return (Criteria) this;
        }

        public Criteria andPackageCreatetimeNotIn(List<Date> values) {
            addCriterion("package_createtime not in", values, "packageCreatetime");
            return (Criteria) this;
        }

        public Criteria andPackageCreatetimeBetween(Date value1, Date value2) {
            addCriterion("package_createtime between", value1, value2, "packageCreatetime");
            return (Criteria) this;
        }

        public Criteria andPackageCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("package_createtime not between", value1, value2, "packageCreatetime");
            return (Criteria) this;
        }

        public Criteria andPackageUpdatimeIsNull() {
            addCriterion("package_updatime is null");
            return (Criteria) this;
        }

        public Criteria andPackageUpdatimeIsNotNull() {
            addCriterion("package_updatime is not null");
            return (Criteria) this;
        }

        public Criteria andPackageUpdatimeEqualTo(Date value) {
            addCriterion("package_updatime =", value, "packageUpdatime");
            return (Criteria) this;
        }

        public Criteria andPackageUpdatimeNotEqualTo(Date value) {
            addCriterion("package_updatime <>", value, "packageUpdatime");
            return (Criteria) this;
        }

        public Criteria andPackageUpdatimeGreaterThan(Date value) {
            addCriterion("package_updatime >", value, "packageUpdatime");
            return (Criteria) this;
        }

        public Criteria andPackageUpdatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("package_updatime >=", value, "packageUpdatime");
            return (Criteria) this;
        }

        public Criteria andPackageUpdatimeLessThan(Date value) {
            addCriterion("package_updatime <", value, "packageUpdatime");
            return (Criteria) this;
        }

        public Criteria andPackageUpdatimeLessThanOrEqualTo(Date value) {
            addCriterion("package_updatime <=", value, "packageUpdatime");
            return (Criteria) this;
        }

        public Criteria andPackageUpdatimeIn(List<Date> values) {
            addCriterion("package_updatime in", values, "packageUpdatime");
            return (Criteria) this;
        }

        public Criteria andPackageUpdatimeNotIn(List<Date> values) {
            addCriterion("package_updatime not in", values, "packageUpdatime");
            return (Criteria) this;
        }

        public Criteria andPackageUpdatimeBetween(Date value1, Date value2) {
            addCriterion("package_updatime between", value1, value2, "packageUpdatime");
            return (Criteria) this;
        }

        public Criteria andPackageUpdatimeNotBetween(Date value1, Date value2) {
            addCriterion("package_updatime not between", value1, value2, "packageUpdatime");
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