-- 1.Display the list of ALL Dentist registered in the system, sorted in ascending
-- order of their lastNames
SELECT * FROM dentist d
ORDER BY d.last_name;

-- 2.Display the list of ALL Appointment for a given Dentist by their dentist_Id
-- number. Include in the result, the Patient information. 
SELECT ap.id, ap.date, ap.dentist_id,
de.first_name as dentist_firstname, 
pa.patient_id as patient_id, 
pa.first_name as patient_firstName,
pa.phone_number as patient_phone_number,
pa.email as patient_email,
pa.dob as patient_dob 
FROM appointment ap
INNER JOIN dentist de
ON ap.dentist_id = de.id
INNER JOIN patients pa
ON ap.patient_id = pa.id;

-- 3.Display the list of ALL Appointment that have been scheduled at a Surgery
-- Location
SELECT * FROM appointment as ap
INNER JOIN surgeries as su
ON ap.surgery_id = su.id
WHERE su.address_id = 2;

-- 4.Display the list--  of the Appointment booked for a given Patient on a given Date.
SELECT * FROM appointment ap
WHERE ap.date = '2023-10-04 09:30:00' AND ap.patient_id = 1