-- Exercise 21: Top Feedback Providers
-- List top 5 users who have submitted the most feedback entries.
SELECT 
    u.user_id, 
    u.full_name, 
    COUNT(f.feedback_id) AS feedback_count
FROM Feedback f
JOIN Users u ON f.user_id = u.user_id
GROUP BY u.user_id, u.full_name
ORDER BY feedback_count DESC
LIMIT 5;