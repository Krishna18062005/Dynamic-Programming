-- Exercise 20: User Engagement Index
-- For each user, calculate how many events they attended and how many feedback entries they submitted.
SELECT 
    u.user_id, 
    u.full_name,
    COUNT(DISTINCT r.event_id) AS events_attended,
    COUNT(f.feedback_id) AS feedback_submitted
FROM Users u
LEFT JOIN Registrations r ON u.user_id = r.user_id
LEFT JOIN Feedback f ON u.user_id = f.user_id
GROUP BY u.user_id, u.full_name;