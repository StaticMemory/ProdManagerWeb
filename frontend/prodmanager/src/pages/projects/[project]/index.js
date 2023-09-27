import ProjectContributorBox from "@/components/ProjectContributorBox";
import { useState } from "react"

export default function ProjectHome(props){
    //TODO:Get Project Name, Request for root subsection, count total number of issues,  check most recent updates on project, show tree view of project, show contributors
    //Check if Project exists, if it does return this information
    const [subsection,increaseSubsections] = useState(["headSubsection"]);
    return <div>
        <div className="text-center text-2xl"><b>Project Name Placeholder</b></div>
        <div className="text-center text-xl">Project Head</div>
        <ProjectContributorBox/>
        Recently Changed:
        <div>Current Issues:</div>
        <div>Users with access:</div>

    </div>
}