import Student from "../components/Student";
import students from "../data/students.json";

export default function Students() {
    return (
        <>
            <h1>Students</h1>

            {students.map((student) => (
                <Student
                    key={student.id}
                    student={student}
                />
            ))}
        </>
    );
}