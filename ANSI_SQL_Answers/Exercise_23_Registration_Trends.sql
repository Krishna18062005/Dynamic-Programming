-- Exercise 23: Registration Trends
-- Show a month-wise registration count trend over the past 12 months.
SELECT 
    DATE_FORMAT(registration_date, '%Y-%m') AS reg_month,
    COUNT(user_id) AS registration_count
FROM Users
WHERE registration_date >= DATE_SUB(CURRENT_DATE, INTERVAL 12 MONTH)
GROUP BY reg_month
ORDER BY reg_month;