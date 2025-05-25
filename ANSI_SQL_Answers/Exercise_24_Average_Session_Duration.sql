-- Exercise 24: Average Session Duration per Event
-- Compute the average duration (in minutes) of sessions in each event.
SELECT 
    e.event_id, 
    e.title,
    AVG(TIMESTAMPDIFF(MINUTE, s.start_time, s.end_time)) AS avg_duration_minutes
FROM Events e
JOIN Sessions s ON e.event_id = s.event_id
GROUP BY e.event_id, e.title;