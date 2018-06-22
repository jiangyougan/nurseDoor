package com.chance.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminFunctionExample() {
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

        public Criteria andAdminFunctionIdIsNull() {
            addCriterion("admin_function_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionIdIsNotNull() {
            addCriterion("admin_function_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionIdEqualTo(String value) {
            addCriterion("admin_function_id =", value, "adminFunctionId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionIdNotEqualTo(String value) {
            addCriterion("admin_function_id <>", value, "adminFunctionId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionIdGreaterThan(String value) {
            addCriterion("admin_function_id >", value, "adminFunctionId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionIdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_function_id >=", value, "adminFunctionId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionIdLessThan(String value) {
            addCriterion("admin_function_id <", value, "adminFunctionId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionIdLessThanOrEqualTo(String value) {
            addCriterion("admin_function_id <=", value, "adminFunctionId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionIdLike(String value) {
            addCriterion("admin_function_id like", value, "adminFunctionId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionIdNotLike(String value) {
            addCriterion("admin_function_id not like", value, "adminFunctionId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionIdIn(List<String> values) {
            addCriterion("admin_function_id in", values, "adminFunctionId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionIdNotIn(List<String> values) {
            addCriterion("admin_function_id not in", values, "adminFunctionId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionIdBetween(String value1, String value2) {
            addCriterion("admin_function_id between", value1, value2, "adminFunctionId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionIdNotBetween(String value1, String value2) {
            addCriterion("admin_function_id not between", value1, value2, "adminFunctionId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionModularIdIsNull() {
            addCriterion("admin_function_modular_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionModularIdIsNotNull() {
            addCriterion("admin_function_modular_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionModularIdEqualTo(String value) {
            addCriterion("admin_function_modular_id =", value, "adminFunctionModularId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionModularIdNotEqualTo(String value) {
            addCriterion("admin_function_modular_id <>", value, "adminFunctionModularId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionModularIdGreaterThan(String value) {
            addCriterion("admin_function_modular_id >", value, "adminFunctionModularId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionModularIdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_function_modular_id >=", value, "adminFunctionModularId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionModularIdLessThan(String value) {
            addCriterion("admin_function_modular_id <", value, "adminFunctionModularId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionModularIdLessThanOrEqualTo(String value) {
            addCriterion("admin_function_modular_id <=", value, "adminFunctionModularId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionModularIdLike(String value) {
            addCriterion("admin_function_modular_id like", value, "adminFunctionModularId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionModularIdNotLike(String value) {
            addCriterion("admin_function_modular_id not like", value, "adminFunctionModularId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionModularIdIn(List<String> values) {
            addCriterion("admin_function_modular_id in", values, "adminFunctionModularId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionModularIdNotIn(List<String> values) {
            addCriterion("admin_function_modular_id not in", values, "adminFunctionModularId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionModularIdBetween(String value1, String value2) {
            addCriterion("admin_function_modular_id between", value1, value2, "adminFunctionModularId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionModularIdNotBetween(String value1, String value2) {
            addCriterion("admin_function_modular_id not between", value1, value2, "adminFunctionModularId");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionAddIsNull() {
            addCriterion("admin_function_add is null");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionAddIsNotNull() {
            addCriterion("admin_function_add is not null");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionAddEqualTo(Integer value) {
            addCriterion("admin_function_add =", value, "adminFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionAddNotEqualTo(Integer value) {
            addCriterion("admin_function_add <>", value, "adminFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionAddGreaterThan(Integer value) {
            addCriterion("admin_function_add >", value, "adminFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_function_add >=", value, "adminFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionAddLessThan(Integer value) {
            addCriterion("admin_function_add <", value, "adminFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionAddLessThanOrEqualTo(Integer value) {
            addCriterion("admin_function_add <=", value, "adminFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionAddIn(List<Integer> values) {
            addCriterion("admin_function_add in", values, "adminFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionAddNotIn(List<Integer> values) {
            addCriterion("admin_function_add not in", values, "adminFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionAddBetween(Integer value1, Integer value2) {
            addCriterion("admin_function_add between", value1, value2, "adminFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionAddNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_function_add not between", value1, value2, "adminFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionDelIsNull() {
            addCriterion("admin_function_del is null");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionDelIsNotNull() {
            addCriterion("admin_function_del is not null");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionDelEqualTo(Integer value) {
            addCriterion("admin_function_del =", value, "adminFunctionDel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionDelNotEqualTo(Integer value) {
            addCriterion("admin_function_del <>", value, "adminFunctionDel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionDelGreaterThan(Integer value) {
            addCriterion("admin_function_del >", value, "adminFunctionDel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_function_del >=", value, "adminFunctionDel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionDelLessThan(Integer value) {
            addCriterion("admin_function_del <", value, "adminFunctionDel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionDelLessThanOrEqualTo(Integer value) {
            addCriterion("admin_function_del <=", value, "adminFunctionDel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionDelIn(List<Integer> values) {
            addCriterion("admin_function_del in", values, "adminFunctionDel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionDelNotIn(List<Integer> values) {
            addCriterion("admin_function_del not in", values, "adminFunctionDel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionDelBetween(Integer value1, Integer value2) {
            addCriterion("admin_function_del between", value1, value2, "adminFunctionDel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionDelNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_function_del not between", value1, value2, "adminFunctionDel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionUpdIsNull() {
            addCriterion("admin_function_upd is null");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionUpdIsNotNull() {
            addCriterion("admin_function_upd is not null");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionUpdEqualTo(Integer value) {
            addCriterion("admin_function_upd =", value, "adminFunctionUpd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionUpdNotEqualTo(Integer value) {
            addCriterion("admin_function_upd <>", value, "adminFunctionUpd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionUpdGreaterThan(Integer value) {
            addCriterion("admin_function_upd >", value, "adminFunctionUpd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionUpdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_function_upd >=", value, "adminFunctionUpd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionUpdLessThan(Integer value) {
            addCriterion("admin_function_upd <", value, "adminFunctionUpd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionUpdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_function_upd <=", value, "adminFunctionUpd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionUpdIn(List<Integer> values) {
            addCriterion("admin_function_upd in", values, "adminFunctionUpd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionUpdNotIn(List<Integer> values) {
            addCriterion("admin_function_upd not in", values, "adminFunctionUpd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionUpdBetween(Integer value1, Integer value2) {
            addCriterion("admin_function_upd between", value1, value2, "adminFunctionUpd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionUpdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_function_upd not between", value1, value2, "adminFunctionUpd");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionSelIsNull() {
            addCriterion("admin_function_sel is null");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionSelIsNotNull() {
            addCriterion("admin_function_sel is not null");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionSelEqualTo(Integer value) {
            addCriterion("admin_function_sel =", value, "adminFunctionSel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionSelNotEqualTo(Integer value) {
            addCriterion("admin_function_sel <>", value, "adminFunctionSel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionSelGreaterThan(Integer value) {
            addCriterion("admin_function_sel >", value, "adminFunctionSel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionSelGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_function_sel >=", value, "adminFunctionSel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionSelLessThan(Integer value) {
            addCriterion("admin_function_sel <", value, "adminFunctionSel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionSelLessThanOrEqualTo(Integer value) {
            addCriterion("admin_function_sel <=", value, "adminFunctionSel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionSelIn(List<Integer> values) {
            addCriterion("admin_function_sel in", values, "adminFunctionSel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionSelNotIn(List<Integer> values) {
            addCriterion("admin_function_sel not in", values, "adminFunctionSel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionSelBetween(Integer value1, Integer value2) {
            addCriterion("admin_function_sel between", value1, value2, "adminFunctionSel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionSelNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_function_sel not between", value1, value2, "adminFunctionSel");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreateterIsNull() {
            addCriterion("admin_function_createter is null");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreateterIsNotNull() {
            addCriterion("admin_function_createter is not null");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreateterEqualTo(String value) {
            addCriterion("admin_function_createter =", value, "adminFunctionCreateter");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreateterNotEqualTo(String value) {
            addCriterion("admin_function_createter <>", value, "adminFunctionCreateter");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreateterGreaterThan(String value) {
            addCriterion("admin_function_createter >", value, "adminFunctionCreateter");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreateterGreaterThanOrEqualTo(String value) {
            addCriterion("admin_function_createter >=", value, "adminFunctionCreateter");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreateterLessThan(String value) {
            addCriterion("admin_function_createter <", value, "adminFunctionCreateter");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreateterLessThanOrEqualTo(String value) {
            addCriterion("admin_function_createter <=", value, "adminFunctionCreateter");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreateterLike(String value) {
            addCriterion("admin_function_createter like", value, "adminFunctionCreateter");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreateterNotLike(String value) {
            addCriterion("admin_function_createter not like", value, "adminFunctionCreateter");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreateterIn(List<String> values) {
            addCriterion("admin_function_createter in", values, "adminFunctionCreateter");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreateterNotIn(List<String> values) {
            addCriterion("admin_function_createter not in", values, "adminFunctionCreateter");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreateterBetween(String value1, String value2) {
            addCriterion("admin_function_createter between", value1, value2, "adminFunctionCreateter");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreateterNotBetween(String value1, String value2) {
            addCriterion("admin_function_createter not between", value1, value2, "adminFunctionCreateter");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreatetimeIsNull() {
            addCriterion("admin_function_createtime is null");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreatetimeIsNotNull() {
            addCriterion("admin_function_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreatetimeEqualTo(Date value) {
            addCriterion("admin_function_createtime =", value, "adminFunctionCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreatetimeNotEqualTo(Date value) {
            addCriterion("admin_function_createtime <>", value, "adminFunctionCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreatetimeGreaterThan(Date value) {
            addCriterion("admin_function_createtime >", value, "adminFunctionCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_function_createtime >=", value, "adminFunctionCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreatetimeLessThan(Date value) {
            addCriterion("admin_function_createtime <", value, "adminFunctionCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("admin_function_createtime <=", value, "adminFunctionCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreatetimeIn(List<Date> values) {
            addCriterion("admin_function_createtime in", values, "adminFunctionCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreatetimeNotIn(List<Date> values) {
            addCriterion("admin_function_createtime not in", values, "adminFunctionCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreatetimeBetween(Date value1, Date value2) {
            addCriterion("admin_function_createtime between", value1, value2, "adminFunctionCreatetime");
            return (Criteria) this;
        }

        public Criteria andAdminFunctionCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("admin_function_createtime not between", value1, value2, "adminFunctionCreatetime");
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