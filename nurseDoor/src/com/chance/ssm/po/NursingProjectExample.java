package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NursingProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NursingProjectExample() {
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

        public Criteria andNursingProjectIdIsNull() {
            addCriterion("nursing_project_id is null");
            return (Criteria) this;
        }

        public Criteria andNursingProjectIdIsNotNull() {
            addCriterion("nursing_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andNursingProjectIdEqualTo(String value) {
            addCriterion("nursing_project_id =", value, "nursingProjectId");
            return (Criteria) this;
        }

        public Criteria andNursingProjectIdNotEqualTo(String value) {
            addCriterion("nursing_project_id <>", value, "nursingProjectId");
            return (Criteria) this;
        }

        public Criteria andNursingProjectIdGreaterThan(String value) {
            addCriterion("nursing_project_id >", value, "nursingProjectId");
            return (Criteria) this;
        }

        public Criteria andNursingProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_project_id >=", value, "nursingProjectId");
            return (Criteria) this;
        }

        public Criteria andNursingProjectIdLessThan(String value) {
            addCriterion("nursing_project_id <", value, "nursingProjectId");
            return (Criteria) this;
        }

        public Criteria andNursingProjectIdLessThanOrEqualTo(String value) {
            addCriterion("nursing_project_id <=", value, "nursingProjectId");
            return (Criteria) this;
        }

        public Criteria andNursingProjectIdLike(String value) {
            addCriterion("nursing_project_id like", value, "nursingProjectId");
            return (Criteria) this;
        }

        public Criteria andNursingProjectIdNotLike(String value) {
            addCriterion("nursing_project_id not like", value, "nursingProjectId");
            return (Criteria) this;
        }

        public Criteria andNursingProjectIdIn(List<String> values) {
            addCriterion("nursing_project_id in", values, "nursingProjectId");
            return (Criteria) this;
        }

        public Criteria andNursingProjectIdNotIn(List<String> values) {
            addCriterion("nursing_project_id not in", values, "nursingProjectId");
            return (Criteria) this;
        }

        public Criteria andNursingProjectIdBetween(String value1, String value2) {
            addCriterion("nursing_project_id between", value1, value2, "nursingProjectId");
            return (Criteria) this;
        }

        public Criteria andNursingProjectIdNotBetween(String value1, String value2) {
            addCriterion("nursing_project_id not between", value1, value2, "nursingProjectId");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidIsNull() {
            addCriterion("nursing_nurseid is null");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidIsNotNull() {
            addCriterion("nursing_nurseid is not null");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidEqualTo(String value) {
            addCriterion("nursing_nurseid =", value, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidNotEqualTo(String value) {
            addCriterion("nursing_nurseid <>", value, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidGreaterThan(String value) {
            addCriterion("nursing_nurseid >", value, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_nurseid >=", value, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidLessThan(String value) {
            addCriterion("nursing_nurseid <", value, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidLessThanOrEqualTo(String value) {
            addCriterion("nursing_nurseid <=", value, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidLike(String value) {
            addCriterion("nursing_nurseid like", value, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidNotLike(String value) {
            addCriterion("nursing_nurseid not like", value, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidIn(List<String> values) {
            addCriterion("nursing_nurseid in", values, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidNotIn(List<String> values) {
            addCriterion("nursing_nurseid not in", values, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidBetween(String value1, String value2) {
            addCriterion("nursing_nurseid between", value1, value2, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingNurseidNotBetween(String value1, String value2) {
            addCriterion("nursing_nurseid not between", value1, value2, "nursingNurseid");
            return (Criteria) this;
        }

        public Criteria andNursingProjectMacontentIsNull() {
            addCriterion("nursing_project_macontent is null");
            return (Criteria) this;
        }

        public Criteria andNursingProjectMacontentIsNotNull() {
            addCriterion("nursing_project_macontent is not null");
            return (Criteria) this;
        }

        public Criteria andNursingProjectMacontentEqualTo(String value) {
            addCriterion("nursing_project_macontent =", value, "nursingProjectMacontent");
            return (Criteria) this;
        }

        public Criteria andNursingProjectMacontentNotEqualTo(String value) {
            addCriterion("nursing_project_macontent <>", value, "nursingProjectMacontent");
            return (Criteria) this;
        }

        public Criteria andNursingProjectMacontentGreaterThan(String value) {
            addCriterion("nursing_project_macontent >", value, "nursingProjectMacontent");
            return (Criteria) this;
        }

        public Criteria andNursingProjectMacontentGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_project_macontent >=", value, "nursingProjectMacontent");
            return (Criteria) this;
        }

        public Criteria andNursingProjectMacontentLessThan(String value) {
            addCriterion("nursing_project_macontent <", value, "nursingProjectMacontent");
            return (Criteria) this;
        }

        public Criteria andNursingProjectMacontentLessThanOrEqualTo(String value) {
            addCriterion("nursing_project_macontent <=", value, "nursingProjectMacontent");
            return (Criteria) this;
        }

        public Criteria andNursingProjectMacontentLike(String value) {
            addCriterion("nursing_project_macontent like", value, "nursingProjectMacontent");
            return (Criteria) this;
        }

        public Criteria andNursingProjectMacontentNotLike(String value) {
            addCriterion("nursing_project_macontent not like", value, "nursingProjectMacontent");
            return (Criteria) this;
        }

        public Criteria andNursingProjectMacontentIn(List<String> values) {
            addCriterion("nursing_project_macontent in", values, "nursingProjectMacontent");
            return (Criteria) this;
        }

        public Criteria andNursingProjectMacontentNotIn(List<String> values) {
            addCriterion("nursing_project_macontent not in", values, "nursingProjectMacontent");
            return (Criteria) this;
        }

        public Criteria andNursingProjectMacontentBetween(String value1, String value2) {
            addCriterion("nursing_project_macontent between", value1, value2, "nursingProjectMacontent");
            return (Criteria) this;
        }

        public Criteria andNursingProjectMacontentNotBetween(String value1, String value2) {
            addCriterion("nursing_project_macontent not between", value1, value2, "nursingProjectMacontent");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteIsNull() {
            addCriterion("nursing_project_note is null");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteIsNotNull() {
            addCriterion("nursing_project_note is not null");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteEqualTo(String value) {
            addCriterion("nursing_project_note =", value, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteNotEqualTo(String value) {
            addCriterion("nursing_project_note <>", value, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteGreaterThan(String value) {
            addCriterion("nursing_project_note >", value, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_project_note >=", value, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteLessThan(String value) {
            addCriterion("nursing_project_note <", value, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteLessThanOrEqualTo(String value) {
            addCriterion("nursing_project_note <=", value, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteLike(String value) {
            addCriterion("nursing_project_note like", value, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteNotLike(String value) {
            addCriterion("nursing_project_note not like", value, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteIn(List<String> values) {
            addCriterion("nursing_project_note in", values, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteNotIn(List<String> values) {
            addCriterion("nursing_project_note not in", values, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteBetween(String value1, String value2) {
            addCriterion("nursing_project_note between", value1, value2, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectNoteNotBetween(String value1, String value2) {
            addCriterion("nursing_project_note not between", value1, value2, "nursingProjectNote");
            return (Criteria) this;
        }

        public Criteria andNursingProjectCreatetimeIsNull() {
            addCriterion("nursing_project_createtime is null");
            return (Criteria) this;
        }

        public Criteria andNursingProjectCreatetimeIsNotNull() {
            addCriterion("nursing_project_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andNursingProjectCreatetimeEqualTo(Date value) {
            addCriterion("nursing_project_createtime =", value, "nursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingProjectCreatetimeNotEqualTo(Date value) {
            addCriterion("nursing_project_createtime <>", value, "nursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingProjectCreatetimeGreaterThan(Date value) {
            addCriterion("nursing_project_createtime >", value, "nursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingProjectCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nursing_project_createtime >=", value, "nursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingProjectCreatetimeLessThan(Date value) {
            addCriterion("nursing_project_createtime <", value, "nursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingProjectCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("nursing_project_createtime <=", value, "nursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingProjectCreatetimeIn(List<Date> values) {
            addCriterion("nursing_project_createtime in", values, "nursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingProjectCreatetimeNotIn(List<Date> values) {
            addCriterion("nursing_project_createtime not in", values, "nursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingProjectCreatetimeBetween(Date value1, Date value2) {
            addCriterion("nursing_project_createtime between", value1, value2, "nursingProjectCreatetime");
            return (Criteria) this;
        }

        public Criteria andNursingProjectCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("nursing_project_createtime not between", value1, value2, "nursingProjectCreatetime");
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