import java.util.ArrayList;
import java.util.Collections;

public class job_sequencing {
    // create objects
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            deadline = d;
            profit = p;
            id = i;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 30 }, { 1, 20 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (a, b) -> (b.profit - a.profit)); // descending order for profit position

        ArrayList<Integer> seq = new ArrayList<>();
        int timer = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > timer) {
                seq.add(curr.id);
                timer++;
            }
        }

        System.out.println("max jobs " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }

    }
}
