-- Exercise 15: Event Session Time Conflict
-- Identify overlapping sessions within the same event.
SELECT 
    s1.event_id, 
    s1.session_id AS session1, 
    s2.session_id AS session2
FROM Sessions s1
JOIN Sessions s2 
    ON s1.event_id = s2.event_id 
   AND s1.session_id < s2.session_id
WHERE s1.end_time > s2.start_time 
  AND s1.start_time < s2.end_time;