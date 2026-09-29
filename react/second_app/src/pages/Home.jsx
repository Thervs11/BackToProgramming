import Swimming from "../components/Swimming.jsx";
import swim from "../data/swim.json";

import Skills from "../components/Skills.jsx";
import skills from "../data/skill.json";

export default function Home() {

  return (
    <>
      <h1>Welcome to Home Page</h1>
      <br />
      <table>
          <thead>
            <tr>
              <th colSpan="4">
                  <h2>Swimming</h2>
              </th>
            </tr>
              <tr>
              <th><h3>Stroke Type</h3></th>
              <th><h3>Difficulty</h3></th>
              <th><h3>How Fast?</h3></th>
              <th><h3>Comments</h3></th>
            </tr>
          </thead>
          <tbody>
              {swim.map((swims, index) => {
              return (
              <tr key={index}>
                <Swimming 
                  strokeType = {swims.strokeType}
                  difficulty = {swims.difficulty}
                  howFast = {swims.howFast}
                  comments = {swims.comments}
                />
              </tr>
              );
              })}
            
          </tbody>
      </table>
      <br />
      <table>
        <thead>
            <tr>
              <th colSpan="3">
                <h2>Skill List:</h2>
              </th>
            </tr>
            <tr>
              <th><h3>Skill</h3></th>
              <th><h3>Description</h3></th>
              <th><h3>How Long?</h3></th>
            </tr>
        </thead>
        <tbody>
              {skills.map((skill, index) => {
                return (
                  <tr key={index}>
                    <Skills 
                      skillName = {skill.skillName}
                      description = {skill.description}
                      howLong = {skill.howLong}
                    />
                  </tr>
                );
              })}
        </tbody>
      </table>
    </>
  );
}
