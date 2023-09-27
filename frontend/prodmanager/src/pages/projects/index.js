import { useState } from "react"

export default function ProjectHomePage(props){
    // Get all users working on projects,
    //Get current issues, view discussions related to projects
    // Look at version history
    const [projects, setProjects] = useState(["project1","project2", "project3", "project4", "project5", "project6","project7","project8","project9"]);

    return <div>
        <div>
        
            <div className="justify-center flex ">
                <div className="w-64rem border-2">
                    <div className="text-center border-y-2">Your Projects</div>
                    <div className="flex flex-box items-center w-64rem flex-wrap justify-center gap-y-32">
                            {projects.map((project,index)=>{
                                return<div className="flex"> 
                                    <div className="pl-16"></div>
                                    <div className="border-2 rounded-2xl w-32 text-center" key={index}>
                                    {project}


                                    </div>
                                    <div className="pl-16"></div>
                                </div>
                            })}
                    </div>
                </div>
        </div>
       </div>
    </div>
}