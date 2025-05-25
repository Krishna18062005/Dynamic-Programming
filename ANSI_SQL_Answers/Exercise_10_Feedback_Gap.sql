-- Exercise 10: Feedback Gap
-- Identify events that had registrations but received no feedback at all.
SELECT DISTINCT 
    e.event_id, 
    e.title
FROM Events e
JOIN Registrations r ON e.event_id = r.event_id
LEFT JOIN Feedback f ON e.event_id = f.event_id
WHERE f.feedback_id IS NULL;