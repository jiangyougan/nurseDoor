package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaseLableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaseLableExample() {
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

        public Criteria andCaseLableIdIsNull() {
            addCriterion("case_lable_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseLableIdIsNotNull() {
            addCriterion("case_lable_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseLableIdEqualTo(String value) {
            addCriterion("case_lable_id =", value, "caseLableId");
            return (Criteria) this;
        }

        public Criteria andCaseLableIdNotEqualTo(String value) {
            addCriterion("case_lable_id <>", value, "caseLableId");
            return (Criteria) this;
        }

        public Criteria andCaseLableIdGreaterThan(String value) {
            addCriterion("case_lable_id >", value, "caseLableId");
            return (Criteria) this;
        }

        public Criteria andCaseLableIdGreaterThanOrEqualTo(String value) {
            addCriterion("case_lable_id >=", value, "caseLableId");
            return (Criteria) this;
        }

        public Criteria andCaseLableIdLessThan(String value) {
            addCriterion("case_lable_id <", value, "caseLableId");
            return (Criteria) this;
        }

        public Criteria andCaseLableIdLessThanOrEqualTo(String value) {
            addCriterion("case_lable_id <=", value, "caseLableId");
            return (Criteria) this;
        }

        public Criteria andCaseLableIdLike(String value) {
            addCriterion("case_lable_id like", value, "caseLableId");
            return (Criteria) this;
        }

        public Criteria andCaseLableIdNotLike(String value) {
            addCriterion("case_lable_id not like", value, "caseLableId");
            return (Criteria) this;
        }

        public Criteria andCaseLableIdIn(List<String> values) {
            addCriterion("case_lable_id in", values, "caseLableId");
            return (Criteria) this;
        }

        public Criteria andCaseLableIdNotIn(List<String> values) {
            addCriterion("case_lable_id not in", values, "caseLableId");
            return (Criteria) this;
        }

        public Criteria andCaseLableIdBetween(String value1, String value2) {
            addCriterion("case_lable_id between", value1, value2, "caseLableId");
            return (Criteria) this;
        }

        public Criteria andCaseLableIdNotBetween(String value1, String value2) {
            addCriterion("case_lable_id not between", value1, value2, "caseLableId");
            return (Criteria) this;
        }

        public Criteria andCaseLableNameIsNull() {
            addCriterion("case_lable_name is null");
            return (Criteria) this;
        }

        public Criteria andCaseLableNameIsNotNull() {
            addCriterion("case_lable_name is not null");
            return (Criteria) this;
        }

        public Criteria andCaseLableNameEqualTo(String value) {
            addCriterion("case_lable_name =", value, "caseLableName");
            return (Criteria) this;
        }

        public Criteria andCaseLableNameNotEqualTo(String value) {
            addCriterion("case_lable_name <>", value, "caseLableName");
            return (Criteria) this;
        }

        public Criteria andCaseLableNameGreaterThan(String value) {
            addCriterion("case_lable_name >", value, "caseLableName");
            return (Criteria) this;
        }

        public Criteria andCaseLableNameGreaterThanOrEqualTo(String value) {
            addCriterion("case_lable_name >=", value, "caseLableName");
            return (Criteria) this;
        }

        public Criteria andCaseLableNameLessThan(String value) {
            addCriterion("case_lable_name <", value, "caseLableName");
            return (Criteria) this;
        }

        public Criteria andCaseLableNameLessThanOrEqualTo(String value) {
            addCriterion("case_lable_name <=", value, "caseLableName");
            return (Criteria) this;
        }

        public Criteria andCaseLableNameLike(String value) {
            addCriterion("case_lable_name like", value, "caseLableName");
            return (Criteria) this;
        }

        public Criteria andCaseLableNameNotLike(String value) {
            addCriterion("case_lable_name not like", value, "caseLableName");
            return (Criteria) this;
        }

        public Criteria andCaseLableNameIn(List<String> values) {
            addCriterion("case_lable_name in", values, "caseLableName");
            return (Criteria) this;
        }

        public Criteria andCaseLableNameNotIn(List<String> values) {
            addCriterion("case_lable_name not in", values, "caseLableName");
            return (Criteria) this;
        }

        public Criteria andCaseLableNameBetween(String value1, String value2) {
            addCriterion("case_lable_name between", value1, value2, "caseLableName");
            return (Criteria) this;
        }

        public Criteria andCaseLableNameNotBetween(String value1, String value2) {
            addCriterion("case_lable_name not between", value1, value2, "caseLableName");
            return (Criteria) this;
        }

        public Criteria andCaseLableNoteIsNull() {
            addCriterion("case_lable_note is null");
            return (Criteria) this;
        }

        public Criteria andCaseLableNoteIsNotNull() {
            addCriterion("case_lable_note is not null");
            return (Criteria) this;
        }

        public Criteria andCaseLableNoteEqualTo(String value) {
            addCriterion("case_lable_note =", value, "caseLableNote");
            return (Criteria) this;
        }

        public Criteria andCaseLableNoteNotEqualTo(String value) {
            addCriterion("case_lable_note <>", value, "caseLableNote");
            return (Criteria) this;
        }

        public Criteria andCaseLableNoteGreaterThan(String value) {
            addCriterion("case_lable_note >", value, "caseLableNote");
            return (Criteria) this;
        }

        public Criteria andCaseLableNoteGreaterThanOrEqualTo(String value) {
            addCriterion("case_lable_note >=", value, "caseLableNote");
            return (Criteria) this;
        }

        public Criteria andCaseLableNoteLessThan(String value) {
            addCriterion("case_lable_note <", value, "caseLableNote");
            return (Criteria) this;
        }

        public Criteria andCaseLableNoteLessThanOrEqualTo(String value) {
            addCriterion("case_lable_note <=", value, "caseLableNote");
            return (Criteria) this;
        }

        public Criteria andCaseLableNoteLike(String value) {
            addCriterion("case_lable_note like", value, "caseLableNote");
            return (Criteria) this;
        }

        public Criteria andCaseLableNoteNotLike(String value) {
            addCriterion("case_lable_note not like", value, "caseLableNote");
            return (Criteria) this;
        }

        public Criteria andCaseLableNoteIn(List<String> values) {
            addCriterion("case_lable_note in", values, "caseLableNote");
            return (Criteria) this;
        }

        public Criteria andCaseLableNoteNotIn(List<String> values) {
            addCriterion("case_lable_note not in", values, "caseLableNote");
            return (Criteria) this;
        }

        public Criteria andCaseLableNoteBetween(String value1, String value2) {
            addCriterion("case_lable_note between", value1, value2, "caseLableNote");
            return (Criteria) this;
        }

        public Criteria andCaseLableNoteNotBetween(String value1, String value2) {
            addCriterion("case_lable_note not between", value1, value2, "caseLableNote");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreaterIsNull() {
            addCriterion("case_lable_creater is null");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreaterIsNotNull() {
            addCriterion("case_lable_creater is not null");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreaterEqualTo(String value) {
            addCriterion("case_lable_creater =", value, "caseLableCreater");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreaterNotEqualTo(String value) {
            addCriterion("case_lable_creater <>", value, "caseLableCreater");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreaterGreaterThan(String value) {
            addCriterion("case_lable_creater >", value, "caseLableCreater");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("case_lable_creater >=", value, "caseLableCreater");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreaterLessThan(String value) {
            addCriterion("case_lable_creater <", value, "caseLableCreater");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreaterLessThanOrEqualTo(String value) {
            addCriterion("case_lable_creater <=", value, "caseLableCreater");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreaterLike(String value) {
            addCriterion("case_lable_creater like", value, "caseLableCreater");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreaterNotLike(String value) {
            addCriterion("case_lable_creater not like", value, "caseLableCreater");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreaterIn(List<String> values) {
            addCriterion("case_lable_creater in", values, "caseLableCreater");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreaterNotIn(List<String> values) {
            addCriterion("case_lable_creater not in", values, "caseLableCreater");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreaterBetween(String value1, String value2) {
            addCriterion("case_lable_creater between", value1, value2, "caseLableCreater");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreaterNotBetween(String value1, String value2) {
            addCriterion("case_lable_creater not between", value1, value2, "caseLableCreater");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreatetimeIsNull() {
            addCriterion("case_lable_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreatetimeIsNotNull() {
            addCriterion("case_lable_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreatetimeEqualTo(Date value) {
            addCriterion("case_lable_createtime =", value, "caseLableCreatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreatetimeNotEqualTo(Date value) {
            addCriterion("case_lable_createtime <>", value, "caseLableCreatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreatetimeGreaterThan(Date value) {
            addCriterion("case_lable_createtime >", value, "caseLableCreatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("case_lable_createtime >=", value, "caseLableCreatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreatetimeLessThan(Date value) {
            addCriterion("case_lable_createtime <", value, "caseLableCreatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("case_lable_createtime <=", value, "caseLableCreatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreatetimeIn(List<Date> values) {
            addCriterion("case_lable_createtime in", values, "caseLableCreatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreatetimeNotIn(List<Date> values) {
            addCriterion("case_lable_createtime not in", values, "caseLableCreatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreatetimeBetween(Date value1, Date value2) {
            addCriterion("case_lable_createtime between", value1, value2, "caseLableCreatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("case_lable_createtime not between", value1, value2, "caseLableCreatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableUpdatetimeIsNull() {
            addCriterion("case_lable_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andCaseLableUpdatetimeIsNotNull() {
            addCriterion("case_lable_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andCaseLableUpdatetimeEqualTo(Date value) {
            addCriterion("case_lable_updatetime =", value, "caseLableUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableUpdatetimeNotEqualTo(Date value) {
            addCriterion("case_lable_updatetime <>", value, "caseLableUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableUpdatetimeGreaterThan(Date value) {
            addCriterion("case_lable_updatetime >", value, "caseLableUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("case_lable_updatetime >=", value, "caseLableUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableUpdatetimeLessThan(Date value) {
            addCriterion("case_lable_updatetime <", value, "caseLableUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("case_lable_updatetime <=", value, "caseLableUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableUpdatetimeIn(List<Date> values) {
            addCriterion("case_lable_updatetime in", values, "caseLableUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableUpdatetimeNotIn(List<Date> values) {
            addCriterion("case_lable_updatetime not in", values, "caseLableUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("case_lable_updatetime between", value1, value2, "caseLableUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCaseLableUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("case_lable_updatetime not between", value1, value2, "caseLableUpdatetime");
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