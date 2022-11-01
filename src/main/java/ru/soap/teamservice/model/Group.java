package ru.soap.teamservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "groups", schema = "service")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "group")
@ToString(exclude = "userGroups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int g_id;
    @Column(name = "groupname")
    private String group;
    @OneToMany(mappedBy = "group", fetch = FetchType.LAZY)
    private Set<User> userGroups;

}

