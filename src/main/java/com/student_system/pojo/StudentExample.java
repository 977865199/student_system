package com.student_system.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(String value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(String value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(String value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(String value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(String value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(String value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLike(String value) {
            addCriterion("student_id like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotLike(String value) {
            addCriterion("student_id not like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<String> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<String> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(String value1, String value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(String value1, String value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSfzIdIsNull() {
            addCriterion("sfz_id is null");
            return (Criteria) this;
        }

        public Criteria andSfzIdIsNotNull() {
            addCriterion("sfz_id is not null");
            return (Criteria) this;
        }

        public Criteria andSfzIdEqualTo(String value) {
            addCriterion("sfz_id =", value, "sfzId");
            return (Criteria) this;
        }

        public Criteria andSfzIdNotEqualTo(String value) {
            addCriterion("sfz_id <>", value, "sfzId");
            return (Criteria) this;
        }

        public Criteria andSfzIdGreaterThan(String value) {
            addCriterion("sfz_id >", value, "sfzId");
            return (Criteria) this;
        }

        public Criteria andSfzIdGreaterThanOrEqualTo(String value) {
            addCriterion("sfz_id >=", value, "sfzId");
            return (Criteria) this;
        }

        public Criteria andSfzIdLessThan(String value) {
            addCriterion("sfz_id <", value, "sfzId");
            return (Criteria) this;
        }

        public Criteria andSfzIdLessThanOrEqualTo(String value) {
            addCriterion("sfz_id <=", value, "sfzId");
            return (Criteria) this;
        }

        public Criteria andSfzIdLike(String value) {
            addCriterion("sfz_id like", value, "sfzId");
            return (Criteria) this;
        }

        public Criteria andSfzIdNotLike(String value) {
            addCriterion("sfz_id not like", value, "sfzId");
            return (Criteria) this;
        }

        public Criteria andSfzIdIn(List<String> values) {
            addCriterion("sfz_id in", values, "sfzId");
            return (Criteria) this;
        }

        public Criteria andSfzIdNotIn(List<String> values) {
            addCriterion("sfz_id not in", values, "sfzId");
            return (Criteria) this;
        }

        public Criteria andSfzIdBetween(String value1, String value2) {
            addCriterion("sfz_id between", value1, value2, "sfzId");
            return (Criteria) this;
        }

        public Criteria andSfzIdNotBetween(String value1, String value2) {
            addCriterion("sfz_id not between", value1, value2, "sfzId");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andMarjorNameIsNull() {
            addCriterion("marjor_name is null");
            return (Criteria) this;
        }

        public Criteria andMarjorNameIsNotNull() {
            addCriterion("marjor_name is not null");
            return (Criteria) this;
        }

        public Criteria andMarjorNameEqualTo(String value) {
            addCriterion("marjor_name =", value, "marjorName");
            return (Criteria) this;
        }

        public Criteria andMarjorNameNotEqualTo(String value) {
            addCriterion("marjor_name <>", value, "marjorName");
            return (Criteria) this;
        }

        public Criteria andMarjorNameGreaterThan(String value) {
            addCriterion("marjor_name >", value, "marjorName");
            return (Criteria) this;
        }

        public Criteria andMarjorNameGreaterThanOrEqualTo(String value) {
            addCriterion("marjor_name >=", value, "marjorName");
            return (Criteria) this;
        }

        public Criteria andMarjorNameLessThan(String value) {
            addCriterion("marjor_name <", value, "marjorName");
            return (Criteria) this;
        }

        public Criteria andMarjorNameLessThanOrEqualTo(String value) {
            addCriterion("marjor_name <=", value, "marjorName");
            return (Criteria) this;
        }

        public Criteria andMarjorNameLike(String value) {
            addCriterion("marjor_name like", value, "marjorName");
            return (Criteria) this;
        }

        public Criteria andMarjorNameNotLike(String value) {
            addCriterion("marjor_name not like", value, "marjorName");
            return (Criteria) this;
        }

        public Criteria andMarjorNameIn(List<String> values) {
            addCriterion("marjor_name in", values, "marjorName");
            return (Criteria) this;
        }

        public Criteria andMarjorNameNotIn(List<String> values) {
            addCriterion("marjor_name not in", values, "marjorName");
            return (Criteria) this;
        }

        public Criteria andMarjorNameBetween(String value1, String value2) {
            addCriterion("marjor_name between", value1, value2, "marjorName");
            return (Criteria) this;
        }

        public Criteria andMarjorNameNotBetween(String value1, String value2) {
            addCriterion("marjor_name not between", value1, value2, "marjorName");
            return (Criteria) this;
        }

        public Criteria andStudentClassIsNull() {
            addCriterion("student_class is null");
            return (Criteria) this;
        }

        public Criteria andStudentClassIsNotNull() {
            addCriterion("student_class is not null");
            return (Criteria) this;
        }

        public Criteria andStudentClassEqualTo(String value) {
            addCriterion("student_class =", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotEqualTo(String value) {
            addCriterion("student_class <>", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassGreaterThan(String value) {
            addCriterion("student_class >", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassGreaterThanOrEqualTo(String value) {
            addCriterion("student_class >=", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassLessThan(String value) {
            addCriterion("student_class <", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassLessThanOrEqualTo(String value) {
            addCriterion("student_class <=", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassLike(String value) {
            addCriterion("student_class like", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotLike(String value) {
            addCriterion("student_class not like", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassIn(List<String> values) {
            addCriterion("student_class in", values, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotIn(List<String> values) {
            addCriterion("student_class not in", values, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassBetween(String value1, String value2) {
            addCriterion("student_class between", value1, value2, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotBetween(String value1, String value2) {
            addCriterion("student_class not between", value1, value2, "studentClass");
            return (Criteria) this;
        }

        public Criteria andEnterDateIsNull() {
            addCriterion("enter_date is null");
            return (Criteria) this;
        }

        public Criteria andEnterDateIsNotNull() {
            addCriterion("enter_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnterDateEqualTo(Date value) {
            addCriterionForJDBCDate("enter_date =", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("enter_date <>", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateGreaterThan(Date value) {
            addCriterionForJDBCDate("enter_date >", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enter_date >=", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateLessThan(Date value) {
            addCriterionForJDBCDate("enter_date <", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enter_date <=", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateIn(List<Date> values) {
            addCriterionForJDBCDate("enter_date in", values, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("enter_date not in", values, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enter_date between", value1, value2, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enter_date not between", value1, value2, "enterDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateIsNull() {
            addCriterion("leave_date is null");
            return (Criteria) this;
        }

        public Criteria andLeaveDateIsNotNull() {
            addCriterion("leave_date is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveDateEqualTo(Date value) {
            addCriterionForJDBCDate("leave_date =", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("leave_date <>", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("leave_date >", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leave_date >=", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateLessThan(Date value) {
            addCriterionForJDBCDate("leave_date <", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leave_date <=", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateIn(List<Date> values) {
            addCriterionForJDBCDate("leave_date in", values, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("leave_date not in", values, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leave_date between", value1, value2, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leave_date not between", value1, value2, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andGraschoolIsNull() {
            addCriterion("graschool is null");
            return (Criteria) this;
        }

        public Criteria andGraschoolIsNotNull() {
            addCriterion("graschool is not null");
            return (Criteria) this;
        }

        public Criteria andGraschoolEqualTo(String value) {
            addCriterion("graschool =", value, "graschool");
            return (Criteria) this;
        }

        public Criteria andGraschoolNotEqualTo(String value) {
            addCriterion("graschool <>", value, "graschool");
            return (Criteria) this;
        }

        public Criteria andGraschoolGreaterThan(String value) {
            addCriterion("graschool >", value, "graschool");
            return (Criteria) this;
        }

        public Criteria andGraschoolGreaterThanOrEqualTo(String value) {
            addCriterion("graschool >=", value, "graschool");
            return (Criteria) this;
        }

        public Criteria andGraschoolLessThan(String value) {
            addCriterion("graschool <", value, "graschool");
            return (Criteria) this;
        }

        public Criteria andGraschoolLessThanOrEqualTo(String value) {
            addCriterion("graschool <=", value, "graschool");
            return (Criteria) this;
        }

        public Criteria andGraschoolLike(String value) {
            addCriterion("graschool like", value, "graschool");
            return (Criteria) this;
        }

        public Criteria andGraschoolNotLike(String value) {
            addCriterion("graschool not like", value, "graschool");
            return (Criteria) this;
        }

        public Criteria andGraschoolIn(List<String> values) {
            addCriterion("graschool in", values, "graschool");
            return (Criteria) this;
        }

        public Criteria andGraschoolNotIn(List<String> values) {
            addCriterion("graschool not in", values, "graschool");
            return (Criteria) this;
        }

        public Criteria andGraschoolBetween(String value1, String value2) {
            addCriterion("graschool between", value1, value2, "graschool");
            return (Criteria) this;
        }

        public Criteria andGraschoolNotBetween(String value1, String value2) {
            addCriterion("graschool not between", value1, value2, "graschool");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNull() {
            addCriterion("native_place is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNotNull() {
            addCriterion("native_place is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceEqualTo(String value) {
            addCriterion("native_place =", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotEqualTo(String value) {
            addCriterion("native_place <>", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThan(String value) {
            addCriterion("native_place >", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("native_place >=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThan(String value) {
            addCriterion("native_place <", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("native_place <=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLike(String value) {
            addCriterion("native_place like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotLike(String value) {
            addCriterion("native_place not like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIn(List<String> values) {
            addCriterion("native_place in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotIn(List<String> values) {
            addCriterion("native_place not in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceBetween(String value1, String value2) {
            addCriterion("native_place between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotBetween(String value1, String value2) {
            addCriterion("native_place not between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andPoliticstatusIsNull() {
            addCriterion("politicstatus is null");
            return (Criteria) this;
        }

        public Criteria andPoliticstatusIsNotNull() {
            addCriterion("politicstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticstatusEqualTo(String value) {
            addCriterion("politicstatus =", value, "politicstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticstatusNotEqualTo(String value) {
            addCriterion("politicstatus <>", value, "politicstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticstatusGreaterThan(String value) {
            addCriterion("politicstatus >", value, "politicstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticstatusGreaterThanOrEqualTo(String value) {
            addCriterion("politicstatus >=", value, "politicstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticstatusLessThan(String value) {
            addCriterion("politicstatus <", value, "politicstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticstatusLessThanOrEqualTo(String value) {
            addCriterion("politicstatus <=", value, "politicstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticstatusLike(String value) {
            addCriterion("politicstatus like", value, "politicstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticstatusNotLike(String value) {
            addCriterion("politicstatus not like", value, "politicstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticstatusIn(List<String> values) {
            addCriterion("politicstatus in", values, "politicstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticstatusNotIn(List<String> values) {
            addCriterion("politicstatus not in", values, "politicstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticstatusBetween(String value1, String value2) {
            addCriterion("politicstatus between", value1, value2, "politicstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticstatusNotBetween(String value1, String value2) {
            addCriterion("politicstatus not between", value1, value2, "politicstatus");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIsNull() {
            addCriterion("student_password is null");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIsNotNull() {
            addCriterion("student_password is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordEqualTo(String value) {
            addCriterion("student_password =", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotEqualTo(String value) {
            addCriterion("student_password <>", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordGreaterThan(String value) {
            addCriterion("student_password >", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("student_password >=", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLessThan(String value) {
            addCriterion("student_password <", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLessThanOrEqualTo(String value) {
            addCriterion("student_password <=", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLike(String value) {
            addCriterion("student_password like", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotLike(String value) {
            addCriterion("student_password not like", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIn(List<String> values) {
            addCriterion("student_password in", values, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotIn(List<String> values) {
            addCriterion("student_password not in", values, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordBetween(String value1, String value2) {
            addCriterion("student_password between", value1, value2, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotBetween(String value1, String value2) {
            addCriterion("student_password not between", value1, value2, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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