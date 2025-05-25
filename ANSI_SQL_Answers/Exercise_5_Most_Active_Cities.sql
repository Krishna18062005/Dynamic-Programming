-- Exercise 5: Most Active Cities
-- List the top 5 cities with the highest number of distinct user registrations.
SELECT 
    u.city, 
    COUNT(DISTINCT u.user_id) AS registration_count
FROM Registrations r
JOIN Users u ON r.user_id = u.user_id
GROUP BY u.city
ORDER BY registration_count DESC
LIMIT 5;