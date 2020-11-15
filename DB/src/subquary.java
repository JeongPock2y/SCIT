
//public class subquary {
//	select
//    e.employee_id as 사원번호
//    ,e.department_id as 부서명
//    ,d.department_name as 부서면
//    ,e.salary as 월급여
//from
//    employees e, departments d
//where
//    e.department_id = d.department_id
//and 
//    e.salary >= 3000;
//select
//    e1.employee_id as 사원번호
//    ,e1.first_name as 이름
//    ,e2.first_name as 매니저이름
//from
//    employees e1, employees e2
//where 
//    e1.manager_id(+) = e2.employee_id;
//
//select
//    e1.employee_id as 사원번호
//    ,e1.first_name as 이름
//    ,e2.first_name as 매니저이름
//from
//    employees e1, employees e2
//where 
//    e1.manager_id = e2.employee_id(+);  
//
//select
//    e.employee_id as 사원번호
//    ,d.department_name as 부서명
//from
//    employees e join departments d using (department_id);
//    
//    select
//    e.employee_id as 사원번호
//    ,d.department_name as 부서명
//from
//    employees e join departments d 
//on 
//    e.department_id = d.department_id
//    join locations l
//on 
//    d.location_id = l.location_id;
//
//select
//    e.department_id as 부서번호
//    ,d.department_name as 부서명
//    ,e.employee_id as 사원번호
//    ,e.first_name as 이름
//    ,e.salary as 월급여
//from
//    departments d, employees e
//where
//    d.department_id = e.department_id
//and 
//    e.salary > 2000
//order by 
//    e.department_id;
//    
//    select
//    e.department_id as 부서번호
//    ,d.department_name as 부서명
//    ,trunc(avg(e.salary)) as 평균 급여
//    ,max(e.salary) as 최대 급여
//    ,min(e.salary) as 최소 급여
//    ,count(*) as 사원수
//from
//     departments d, employees e
//where
//    d.department_id = e.department_id
//group by
//    e.department_id , d.department_name;
//order by
//    e.department_id;
//    
//     
//select
//      e.department_id as 부서번호
//    ,d.department_name as 부서명
//    ,e.employee_id as 사원번호
//    ,e.first_name as 이름
//    ,e.salary as 월급여
//from
//     departments d, employees e
//where
//    d.department_id = e.department_id;
//    
//
//    
//select
//    first_name
//    ,salary
//from
//    employees
//where
//    salary > (select
//        salary
//    FROM
//        employees
//    where
//        first_name ='Bruce');
//
//
//select
//    job_id as 직책
//    ,avg(salary) as 평균급여
//    ,max(salary) as 최고급여
//    ,min(salary) as 최저급여
//from
//    employees
//group by
//    job_id;
//    
//select
//    nvl(employee_id, 0) as 매니저번호
//    ,avg(salary) as 평균급여
//    ,max(salary) as 최고급여
//    ,min(salary) as 최저급여
//from
//    employees
//group by
//    nvl(employee_id, 0)
//having
//    avg(salary) >= 4000;
//    
//select
//    d.department_id as 부서번호
//    ,d.department_name as 부서명
//    ,l.street_address as 주소
//from
//    departments d, locations l
//where  
//    d.location_id = l.location_id
//order by
//    d.department_id asc;
//
//
//
//
//    
//select
//   e.employee_id as 사원번호
//    ,e.first_name as 이름
//    ,e.last_name as  성
//    ,d.department_name as 부서명
//    ,d.department_id as  부서번호
//    ,l.street_address as 주소
//from
//    employees e,departments d, locations l
//where  
//    e.department_id = d.department_id
//    and
//    d.location_id = l.location_id;
//    
//select
//    *
//from
//    employees
//where
//    hire_date <(
//                    select
//                            hire_date
//                    from
//                            employees
//                    where   
//                            first_name ='Adam');
//// 단일형 서브쿼리와 함수
//select
//    e.employee_id as 사원번호
//    ,e.first_name as 이름
//    ,d.department_name as 부서명
//from
//    employees e,departments d
//where
//    e.department_id = d.department_id
//and
//    e.department_id = 50
//and
//    e.salary > (select
//                    avg(salary)
//                from
//                    employees);
//}
//
//
//
//
