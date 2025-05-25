-- Exercise 18: Resource Availability Check
-- List all events that do not have any resources uploaded.
SELECT 
    e.event_id, 
    e.title
FROM Events e
LEFT JOIN Resources r ON e.event_id = r.event_id
WHERE r.resource_id IS NULL;