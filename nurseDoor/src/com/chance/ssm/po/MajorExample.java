package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MajorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MajorExample() {
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

        public Criteria andMajorIdIsNull() {
            addCriterion("major_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNotNull() {
            addCriterion("major_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorIdEqualTo(String value) {
            addCriterion("major_id =", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotEqualTo(String value) {
            addCriterion("major_id <>", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThan(String value) {
            addCriterion("major_id >", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThanOrEqualTo(String value) {
            addCriterion("major_id >=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThan(String value) {
            addCriterion("major_id <", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThanOrEqualTo(String value) {
            addCriterion("major_id <=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLike(String value) {
            addCriterion("major_id like", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotLike(String value) {
            addCriterion("major_id not like", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIn(List<String> values) {
            addCriterion("major_id in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotIn(List<String> values) {
            addCriterion("major_id not in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdBetween(String value1, String value2) {
            addCriterion("major_id between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotBetween(String value1, String value2) {
            addCriterion("major_id not between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNull() {
            addCriterion("major_name is null");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNotNull() {
            addCriterion("major_name is not null");
            return (Criteria) this;
        }

        public Criteria andMajorNameEqualTo(String value) {
            addCriterion("major_name =", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotEqualTo(String value) {
            addCriterion("major_name <>", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThan(String value) {
            addCriterion("major_name >", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("major_name >=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThan(String value) {
            addCriterion("major_name <", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThanOrEqualTo(String value) {
            addCriterion("major_name <=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLike(String value) {
            addCriterion("major_name like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotLike(String value) {
            addCriterion("major_name not like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameIn(List<String> values) {
            addCriterion("major_name in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotIn(List<String> values) {
            addCriterion("major_name not in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameBetween(String value1, String value2) {
            addCriterion("major_name between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotBetween(String value1, String value2) {
            addCriterion("major_name not between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNoteIsNull() {
            addCriterion("major_note is null");
            return (Criteria) this;
        }

        public Criteria andMajorNoteIsNotNull() {
            addCriterion("major_note is not null");
            return (Criteria) this;
        }

        public Criteria andMajorNoteEqualTo(String value) {
            addCriterion("major_note =", value, "majorNote");
            return (Criteria) this;
        }

        public Criteria andMajorNoteNotEqualTo(String value) {
            addCriterion("major_note <>", value, "majorNote");
            return (Criteria) this;
        }

        public Criteria andMajorNoteGreaterThan(String value) {
            addCriterion("major_note >", value, "majorNote");
            return (Criteria) this;
        }

        public Criteria andMajorNoteGreaterThanOrEqualTo(String value) {
            addCriterion("major_note >=", value, "majorNote");
            return (Criteria) this;
        }

        public Criteria andMajorNoteLessThan(String value) {
            addCriterion("major_note <", value, "majorNote");
            return (Criteria) this;
        }

        public Criteria andMajorNoteLessThanOrEqualTo(String value) {
            addCriterion("major_note <=", value, "majorNote");
            return (Criteria) this;
        }

        public Criteria andMajorNoteLike(String value) {
            addCriterion("major_note like", value, "majorNote");
            return (Criteria) this;
        }

        public Criteria andMajorNoteNotLike(String value) {
            addCriterion("major_note not like", value, "majorNote");
            return (Criteria) this;
        }

        public Criteria andMajorNoteIn(List<String> values) {
            addCriterion("major_note in", values, "majorNote");
            return (Criteria) this;
        }

        public Criteria andMajorNoteNotIn(List<String> values) {
            addCriterion("major_note not in", values, "majorNote");
            return (Criteria) this;
        }

        public Criteria andMajorNoteBetween(String value1, String value2) {
            addCriterion("major_note between", value1, value2, "majorNote");
            return (Criteria) this;
        }

        public Criteria andMajorNoteNotBetween(String value1, String value2) {
            addCriterion("major_note not between", value1, value2, "majorNote");
            return (Criteria) this;
        }

        public Criteria andMajorDetailsIsNull() {
            addCriterion("major_details is null");
            return (Criteria) this;
        }

        public Criteria andMajorDetailsIsNotNull() {
            addCriterion("major_details is not null");
            return (Criteria) this;
        }

        public Criteria andMajorDetailsEqualTo(String value) {
            addCriterion("major_details =", value, "majorDetails");
            return (Criteria) this;
        }

        public Criteria andMajorDetailsNotEqualTo(String value) {
            addCriterion("major_details <>", value, "majorDetails");
            return (Criteria) this;
        }

        public Criteria andMajorDetailsGreaterThan(String value) {
            addCriterion("major_details >", value, "majorDetails");
            return (Criteria) this;
        }

        public Criteria andMajorDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("major_details >=", value, "majorDetails");
            return (Criteria) this;
        }

        public Criteria andMajorDetailsLessThan(String value) {
            addCriterion("major_details <", value, "majorDetails");
            return (Criteria) this;
        }

        public Criteria andMajorDetailsLessThanOrEqualTo(String value) {
            addCriterion("major_details <=", value, "majorDetails");
            return (Criteria) this;
        }

        public Criteria andMajorDetailsLike(String value) {
            addCriterion("major_details like", value, "majorDetails");
            return (Criteria) this;
        }

        public Criteria andMajorDetailsNotLike(String value) {
            addCriterion("major_details not like", value, "majorDetails");
            return (Criteria) this;
        }

        public Criteria andMajorDetailsIn(List<String> values) {
            addCriterion("major_details in", values, "majorDetails");
            return (Criteria) this;
        }

        public Criteria andMajorDetailsNotIn(List<String> values) {
            addCriterion("major_details not in", values, "majorDetails");
            return (Criteria) this;
        }

        public Criteria andMajorDetailsBetween(String value1, String value2) {
            addCriterion("major_details between", value1, value2, "majorDetails");
            return (Criteria) this;
        }

        public Criteria andMajorDetailsNotBetween(String value1, String value2) {
            addCriterion("major_details not between", value1, value2, "majorDetails");
            return (Criteria) this;
        }

        public Criteria andMajorCreateterIsNull() {
            addCriterion("major_createter is null");
            return (Criteria) this;
        }

        public Criteria andMajorCreateterIsNotNull() {
            addCriterion("major_createter is not null");
            return (Criteria) this;
        }

        public Criteria andMajorCreateterEqualTo(String value) {
            addCriterion("major_createter =", value, "majorCreateter");
            return (Criteria) this;
        }

        public Criteria andMajorCreateterNotEqualTo(String value) {
            addCriterion("major_createter <>", value, "majorCreateter");
            return (Criteria) this;
        }

        public Criteria andMajorCreateterGreaterThan(String value) {
            addCriterion("major_createter >", value, "majorCreateter");
            return (Criteria) this;
        }

        public Criteria andMajorCreateterGreaterThanOrEqualTo(String value) {
            addCriterion("major_createter >=", value, "majorCreateter");
            return (Criteria) this;
        }

        public Criteria andMajorCreateterLessThan(String value) {
            addCriterion("major_createter <", value, "majorCreateter");
            return (Criteria) this;
        }

        public Criteria andMajorCreateterLessThanOrEqualTo(String value) {
            addCriterion("major_createter <=", value, "majorCreateter");
            return (Criteria) this;
        }

        public Criteria andMajorCreateterLike(String value) {
            addCriterion("major_createter like", value, "majorCreateter");
            return (Criteria) this;
        }

        public Criteria andMajorCreateterNotLike(String value) {
            addCriterion("major_createter not like", value, "majorCreateter");
            return (Criteria) this;
        }

        public Criteria andMajorCreateterIn(List<String> values) {
            addCriterion("major_createter in", values, "majorCreateter");
            return (Criteria) this;
        }

        public Criteria andMajorCreateterNotIn(List<String> values) {
            addCriterion("major_createter not in", values, "majorCreateter");
            return (Criteria) this;
        }

        public Criteria andMajorCreateterBetween(String value1, String value2) {
            addCriterion("major_createter between", value1, value2, "majorCreateter");
            return (Criteria) this;
        }

        public Criteria andMajorCreateterNotBetween(String value1, String value2) {
            addCriterion("major_createter not between", value1, value2, "majorCreateter");
            return (Criteria) this;
        }

        public Criteria andMajorCteatetimeIsNull() {
            addCriterion("major_cteatetime is null");
            return (Criteria) this;
        }

        public Criteria andMajorCteatetimeIsNotNull() {
            addCriterion("major_cteatetime is not null");
            return (Criteria) this;
        }

        public Criteria andMajorCteatetimeEqualTo(Date value) {
            addCriterion("major_cteatetime =", value, "majorCteatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCteatetimeNotEqualTo(Date value) {
            addCriterion("major_cteatetime <>", value, "majorCteatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCteatetimeGreaterThan(Date value) {
            addCriterion("major_cteatetime >", value, "majorCteatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCteatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("major_cteatetime >=", value, "majorCteatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCteatetimeLessThan(Date value) {
            addCriterion("major_cteatetime <", value, "majorCteatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCteatetimeLessThanOrEqualTo(Date value) {
            addCriterion("major_cteatetime <=", value, "majorCteatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCteatetimeIn(List<Date> values) {
            addCriterion("major_cteatetime in", values, "majorCteatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCteatetimeNotIn(List<Date> values) {
            addCriterion("major_cteatetime not in", values, "majorCteatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCteatetimeBetween(Date value1, Date value2) {
            addCriterion("major_cteatetime between", value1, value2, "majorCteatetime");
            return (Criteria) this;
        }

        public Criteria andMajorCteatetimeNotBetween(Date value1, Date value2) {
            addCriterion("major_cteatetime not between", value1, value2, "majorCteatetime");
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