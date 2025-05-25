-- Exercise 22: Duplicate Registrations Check
-- Detect if a user has been registered more than once for the same event.
SELECT 
    r.user_id, 
    r.event_id, 
    COUNT(*) AS registration_count
FROM Registrations r
GROUP BY r.user_id, r.event_id
HAVING COUNT(*) > 1;