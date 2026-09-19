import { Link, useParams } from "react-router-dom";

import students from "../data/students.json";

function StudentDetails() {

  const { id } = useParams();

  const student = students.find(
    (student) => student.id === parseInt(id, 10)
  );

  if (!student) {
    return (
      <div className="page-container">

        <h1>Student Not Found</h1>

        <Link to="/students">
          Back to Students
        </Link>

      </div>
    );
  }

  return (
    <div className="page-container">

      <h1>Student Details</h1>

      <div className="details-card">

        <h2>{student.name}</h2>

        <p>
          <strong>Student Number:</strong>{" "}
          {student.studentNumber}
        </p>

        <p>
          <strong>Course:</strong>{" "}
          {student.course}
        </p>

        <p>
          <strong>Year:</strong>{" "}
          {student.year}
        </p>

        <p>
          <strong>Section:</strong>{" "}
          {student.section}
        </p>

        <p>
          <strong>Email:</strong>{" "}
          {student.email}
        </p>

      </div>

      <Link to="/students">
        Back to Students
      </Link>

    </div>
  );
}

export default StudentDetails;